package com.changtao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClient2Controller {
    @RequestMapping("test2")
    public String testClient2(){
        return "testclient2";
    }
}
