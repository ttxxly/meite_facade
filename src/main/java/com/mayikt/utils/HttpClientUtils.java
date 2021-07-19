package com.mayikt.utils;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: HttpClientUtils
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/2317:41
 */
@Slf4j
public class HttpClientUtils {

    public static String doPost(String url, String text) {
        log.info(">>>Url:{},text:{}", url, text);
        return "success";
    }
}
