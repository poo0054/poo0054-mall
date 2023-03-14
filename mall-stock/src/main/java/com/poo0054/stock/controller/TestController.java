package com.poo0054.stock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangzhi
 * @date 2023/3/14
 */
@RequestMapping("test")
@RestController
public class TestController {
    @GetMapping
    public String test() {
        return "test";
    }

}
