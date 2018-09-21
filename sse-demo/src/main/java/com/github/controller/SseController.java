package com.github.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SSE 推送也是轮询机制，和前端ajax异步轮询在体验上无差别
 * SSE 请求间隔时间不可控。
 *
 * 经测试：
 *   Chrome浏览器每3秒请求一次
 *   Firefox浏览器每5秒请求一次
 *   IE浏览器不支持此方式
 */
@Controller
public class SseController {

    /**
     * SSE 返回的数据必须以“data：”开头，“\n\n”结尾
     * @return
     */
    @RequestMapping(value = "/push.do", produces = "text/event-stream;charset=UTF-8")
    @ResponseBody
    public String pushEvent(){
        String data = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
        return "data:" + data + "\n\n";
    }

}
