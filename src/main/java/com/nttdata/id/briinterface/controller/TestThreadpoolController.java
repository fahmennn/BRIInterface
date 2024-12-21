package com.nttdata.id.briinterface.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.id.briinterface.service.TestingThreadpoolService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/threadpool")
public class TestThreadpoolController {
  @Autowired
  private TestingThreadpoolService testingThreadpoolService;

  // @PostMapping("/process/info")
  // public String processRequest(@RequestBody String requestData) {
  //   return testingThreadpoolService.handleRequest(requestData);
  // }
  
//   @PostMapping("/execute")
//   public String executeTasks() {
//       for (int i = 1; i <= 30; i++) { // Misalnya menjalankan 15 task secara bersamaan
//           testingThreadpoolService.performTask(i);
//       }
//       return "Tasks are being executed";
//   }

  @PostMapping("/execute2")
  public String executeTasks2() {
      for (int i = 1; i <= 20; i++) { // Misalnya menjalankan 15 task secara bersamaan
          testingThreadpoolService.performTask2(i);
      }
      return "Tasks are being executed";
  }
}
