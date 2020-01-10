package com.kede.springbootmybatis;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@RequestMapping("/ad")
public class hello {
    @PostMapping("/add")
    @ResponseBody
    public void addMulQuestion(@RequestParam(value = "books[]", required = false) ArrayList<String> books) {
        System.out.println("LLllllll");

    }
}
