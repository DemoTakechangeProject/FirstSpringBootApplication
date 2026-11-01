package com.FirstSpringBootApplication.FirstSpringBootApplication.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello") // endpoint
    public String sayHello() {
        return "Hello! Spring Boot is working.";
    }

    @GetMapping("/addStudent")
    public String addStudentInfo(){
        return "Student register successfully!";
    }

    @GetMapping()
    public String  getProduct(){
        return "Return all the product data";
    }

    @DeleteMapping()
    public String deleteStudent(){
        return "Student deleted successfully";
    }
}

// http://localhost:8080/hello
// http://localhost:8080/addStudent

// http://localhost:8080/api/hello
// http://localhost:8080/api/addStudent

// http://

//method : GET
//api : http://localhost:8080/api

//method : DELETE
//api : http://localhost:8080/api