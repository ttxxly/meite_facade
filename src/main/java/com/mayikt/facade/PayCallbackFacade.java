package com.mayikt.facade;

import com.mayikt.service.IntegralService;
import com.mayikt.service.LogService;
import com.mayikt.service.MsgService;
import com.mayikt.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: PayCallbackFacade
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/2518:50
 */
@Component
public class PayCallbackFacade {
    @Autowired
    private LogService logService;
    @Autowired
    private PaymentService paymentService;
    @Autowired
    private IntegralService integralService;
    @Autowired
    private MsgService msgService;

    public boolean callbackFacade(Map<String, String> verifySignature) {
        logService.logService(verifySignature);
        paymentService.updatePaymentStatus();
        integralService.callIntegral();
        msgService.msgService();
        return true;
    }
}
