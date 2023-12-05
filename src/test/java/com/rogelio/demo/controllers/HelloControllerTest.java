package com.rogelio.demo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {
    @Test
    void sayHello(){
        HelloController controller = new HelloController();
        Model model = new BindingAwareModelMap();
        String result = controller.sayHello("World",model);
        assertAll(
                () -> assertEquals("World",model.getAttribute("user")),
                () ->assertEquals("welcome",result)
        );
    }
}