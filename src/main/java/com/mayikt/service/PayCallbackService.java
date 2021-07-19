package com.mayikt.service;

import com.mayikt.facade.PayCallbackFacade;
import com.mayikt.mapper.PaymentTransactionMapper;
import com.mayikt.utils.HttpClientUtils;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: PayCallbackService
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/2518:35
 */
@Slf4j
public class PayCallbackService {
    // 用户下单成功后，有那些操作？
    // 1.增加支付回调接口日志
    // 2.修改订单数据库状态为已经成功
    // 3.调用积分服务接口
    // 4.调用消息服务平台服务接口
    private PayCallbackFacade payCallbackFacade;

    public boolean callback(Map<String, String> verifySignature) {
//        // 1.第一步打印日志信息
//        String orderId = verifySignature.get("orderId"); // 获取后台通知的数据，其他字段也可用类似方式获取
//        String respCode = verifySignature.get("respCode");
//        log.info("orderId:{},respCode:{}", orderId, respCode);
//        // 2.修改订单状态为已经支付
//        new PaymentTransactionMapper() {
//            @Override
//            public void updatePaymentStatus() {
//                log.info(">>>修改订单状态为已经支付>>>>>");
//            }
//        }.updatePaymentStatus();
//        // 3.调用积分接口增加积分
//        HttpClientUtils.doPost("jifen.com", "积分接口");
//        // 4.调用消息服务平台提示
//        HttpClientUtils.doPost("msg.com", "调用消息接口");
        boolean result = payCallbackFacade.callbackFacade(verifySignature);
        return result;
    }
}
