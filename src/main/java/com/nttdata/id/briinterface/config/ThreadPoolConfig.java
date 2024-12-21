package com.nttdata.id.briinterface.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
public class ThreadPoolConfig {

    // @Bean(name = "busyTaskExecutor")
    // public Executor busyTaskExecutor() {
    //     ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
    //     executor.setCorePoolSize(20);
    //     executor.setMaxPoolSize(100);
    //     executor.setQueueCapacity(200);
    //     executor.setThreadNamePrefix("busy-task-");
    //     executor.initialize();
    //     return executor;
    // }

    // @Bean(name = "idleTaskExecutor")
    // public Executor idleTaskExecutor() {
    //     ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
    //     executor.setCorePoolSize(5);
    //     executor.setMaxPoolSize(20);
    //     executor.setQueueCapacity(50);
    //     executor.setThreadNamePrefix("idle-task-");
    //     executor.initialize();
    //     return executor;
    // }

    @Bean(name = "busyTaskExecutor")
    public Executor busyTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(20);
        executor.setMaxPoolSize(100);
        executor.setQueueCapacity(10);
        executor.setThreadNamePrefix("Busy-Executor-");
        executor.setWaitForTasksToCompleteOnShutdown(true);
        executor.initialize();
        return executor;
    }

    @Bean(name = "idleTaskExecutor")
    public Executor idleTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(20);
        executor.setQueueCapacity(20);
        executor.setThreadNamePrefix("Idle-Executor-");
        executor.setWaitForTasksToCompleteOnShutdown(true);
        executor.initialize();
        return executor;
    }
}
