package com.nttdata.id.briinterface.service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class TestingThreadpoolService {

    private static final Logger logger = LoggerFactory.getLogger(TestingThreadpoolService.class);
    private boolean shouldContinue = true;

    @Autowired
    private Executor busyTaskExecutor;

    @Autowired
    private Executor idleTaskExecutor;


    // @Async
    // public CompletableFuture<Void> performTask(int taskId) {
    //     // Coba jalankan di busyTaskExecutor dan alihkan ke idleTaskExecutor jika penuh
    //     try {
    //         CompletableFuture.runAsync(() -> executeTask(taskId, "busy"), busyTaskExecutor);
    //     } catch (RejectedExecutionException ex) {
    //         // Jika busyTaskExecutor penuh, alihkan ke idleTaskExecutor
    //         logger.warn("busyTaskExecutor penuh. Menjalankan task {} di idleTaskExecutor.", taskId);
    //         CompletableFuture.runAsync(() -> executeTask(taskId, "idle"), idleTaskExecutor);
    //     } catch (Exception e) {
    //         logger.error("Error saat menjalankan task {}: {}", taskId, e.getMessage());
    //     }
    //     return CompletableFuture.completedFuture(null);
    // }

    @Async
    public CompletableFuture<Void> performTask2(int taskId) {
        // Declare the CompletableFuture variable
        CompletableFuture<Void> future = new CompletableFuture<>();
        // AtomicBoolean shouldContinue = new AtomicBoolean(true); // Reset the shared flag
        // Run the task asynchronously
        CompletableFuture.runAsync(() -> {
            try {
                executeTask(taskId, "busy"); // Execute the task
                future.complete(null); // Complete the future if the task is successful
            } catch (Exception ex) {
                future.completeExceptionally(ex); // Complete exceptionally if an error occurs
            }
        }, busyTaskExecutor)
        .orTimeout(0, TimeUnit.SECONDS)  // Set the timeout for 2 seconds
        .exceptionally(ex -> {
            if (ex instanceof TimeoutException) {
                logger.error("Task {} timed out, cancelling all tasks...", taskId);
                // shouldContinue.set(false); // Stop all further task execution
                shouldContinue = false;
                future.cancel(true); // Cancel the future
            }
            logger.error("Error while executing task {}: {}", taskId, ex.getMessage());
            return null;
        });

        return future;
    }

    private void executeTask(int taskId, String executorType) {
        Thread currentThread = Thread.currentThread();
        logger.info("Executing task {} on {}-Executor thread {}", taskId, executorType, currentThread.getName());
        shouldContinue = true;
        try {
            // Main loop simulating work
            // while (shouldContinue) { // Check the shared flag
            //     // Check if the thread was interrupted and break out of the loop if so
            //     checkInterruption(currentThread);

            //     i++;
            //     logger.info("Task step {}", i);
            //     Thread.sleep(1000); // Simulate a time-consuming task

            //     // Additional check for interruption
            //     if (Thread.currentThread().isInterrupted()) {
            //         logger.error("Task {} was interrupted, exiting loop.", taskId);
            //         break;
            //     }
            // }
            if (shouldContinue == false) {
                logger.error("Task {} was interrupted, exiting loop.", taskId);
                return;
                // break;
            }
            logger.info("Task1");
            Thread.sleep(1000); // Simulate a time-consuming task
            if (shouldContinue == false) {
                logger.error("Task {} was interrupted, exiting loop.", taskId);
                return;
                // break;
            }
            logger.info("Task2");
            Thread.sleep(1000); // Simulate a time-consuming task
            if (shouldContinue == false) {
                logger.error("Task {} was interrupted, exiting loop.", taskId);
                return;
                // break;
            }
            logger.info("Task3");
            Thread.sleep(1000); // Simulate a time-consuming task
            if (shouldContinue == false) {
                logger.error("Task {} was interrupted, exiting loop.", taskId);
                return;
                // break;
            }
            logger.info("Task4");
            Thread.sleep(1000); // Simulate a time-consuming task
            if (shouldContinue == false) {
                logger.error("Task {} was interrupted, exiting loop.", taskId);
                return;
                // break;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Set the interrupt flag
            logger.error("Task {} was interrupted", taskId);
        }
        logger.info("Completed task {} on {}-Executor", taskId, executorType);
    }

    private void checkInterruption(Thread currentThread) {
        if (currentThread.isInterrupted()) {
            throw new RuntimeException("Thread was interrupted and will terminate execution.");
        }
    }
}
