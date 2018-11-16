package com.cmcm.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Spontaneously
 * @time 2018-11-14 下午6:03
 */
@RestController
public class ZookeeperController {

    @RequestMapping("/")
    public String home() {
        return "Hello world";
    }
}
