package com.gears.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gears.model.ModelTest;

@RestController
public class DemoController {

    @RequestMapping("/greeting2")
    public ModelTest sayHello() {
        return new ModelTest("conejo.pepito", "123abc");
    }

}
