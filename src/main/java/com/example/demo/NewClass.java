/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Medu
 */
@RestController
public class NewClass {
    
    @GetMapping("/")
    public String list(){
        return "Mehedi";
    }
    
    @GetMapping("people")
    public  List<String> List(){
        List<String> people = new ArrayList<>();
        people.add("Mehedi");
        people.add("mdmehedi03@gmail.com");
        people.add("01621640037");
        people.add("Noakhali");
        
        return people;
   
    }

    
}
