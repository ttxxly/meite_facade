package com.mayikt.service;

import com.mayikt.mapper.PaymentTransactionMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: PaymentService
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/2518:46
 */
@Slf4j
@Component
public class PaymentService {

    public void updatePaymentStatus() {
        // 2.修改订单状态为已经支付
        new PaymentTransactionMapper() {
            @Override
            public void updatePaymentStatus() {
                log.info("第二个模块>>>修改订单状态为已经支付>>>>>");
            }
        }.updatePaymentStatus();
    }
}
