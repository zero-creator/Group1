package com.group1.Group1Sprint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/helloworld")
public class HelloWorldAPI {
    @Autowired
    private HelloWorldRepository HelloWorldRepo;

   @PostMapping
   public HelloWorldModel addhelloworld(@RequestBody HelloWorldModel helloWorldModel) {
       return this.HelloWorldRepo.save(helloWorldModel);
   }

    @GetMapping
    public List<HelloWorldModel> gethelloworld() {
        return this.HelloWorldRepo.findAll();
    }
}
