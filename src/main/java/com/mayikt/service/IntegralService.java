package com.mayikt.service;

import com.mayikt.utils.HttpClientUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: IntegralService
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/2518:47
 */
@Component
@Slf4j
public class IntegralService {

    public void callIntegral() {
        // 3.调用积分接口增加积分
        HttpClientUtils.doPost("jifen.com", "积分接口");
        log.info("第三个模块>>>调用积分接口打印日志>>>>>");
    }
}
