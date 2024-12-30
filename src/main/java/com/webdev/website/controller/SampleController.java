//package com.webdev.website.controller;
//
//import com.webdev.website.model.SampleModel;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import com.webdev.website.service.SampleService;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//public class SampleController {
//
//    @RequestMapping("")
//    public String welcome() {
//        return "Welcome";
//    }
//
//    @Autowired
//    SampleService service;
//
//    @GetMapping("/products")
//    public List<SampleModel> getProd() {
//        return service.getProd();
//    }
//
//    @GetMapping("/products/{id}")
//    public SampleModel getoneProd(@PathVariable int id) {
//        return service.getOneProd(id);
//    }
//
//
//
//}
