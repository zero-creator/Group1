package com.group1.Group1Sprint.controllers;

import com.group1.Group1Sprint.models.HelloWorldModel;
import com.group1.Group1Sprint.repositories.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/helloworld")
public class HelloWorldController {
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
