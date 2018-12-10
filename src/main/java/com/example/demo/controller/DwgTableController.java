package com.example.demo.controller;

import com.example.demo.service.DwgTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DwgTableController {

    @Autowired
    DwgTableService dwgTableService;


    @PostMapping("/find/{id}")
    public Object findById(@PathVariable("id") Integer id){
        return dwgTableService.findById(id);
    }

}
