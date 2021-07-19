package com.mayikt.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: LogService
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/2518:45
 */
@Component
@Slf4j
public class LogService {

    public void logService(Map<String, String> verifySignature) {
        // 1.第一步打印日志信息
        String orderId = verifySignature.get("orderId"); // 获取后台通知的数据，其他字段也可用类似方式获取
        String respCode = verifySignature.get("respCode");
        log.info("第一个模块>>>orderId:{},respCode:{}", orderId, respCode);
    }

}
