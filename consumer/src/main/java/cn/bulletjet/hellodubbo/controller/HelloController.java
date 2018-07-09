package cn.bulletjet.hellodubbo.controller;


import cn.bulletjet.hellodubbo.service.EchoService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class HelloController {

    @Reference
    private EchoService echoService;

    @RequestMapping("/hello")
    public String hello(@PathParam("name") String name) {
        return echoService.sayHello(name);        // TODO
    }


}
