package com.mayikt.controller;

import com.mayikt.facade.PayCallbackFacade;
import com.mayikt.service.PayCallbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: PayCallbackController
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/2518:54
 */
@RestController
public class PayCallbackController {
    @Autowired
    private PayCallbackService payCallbackService;

    @RequestMapping("/payCallback")
    public String payCallback(Map<String, String> verifySignature) {
        payCallbackService.callback(verifySignature);
        return "success";
    }
}
