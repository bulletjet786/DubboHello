package cn.bulletjet.hellodubbo.service;


import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service(interfaceClass = EchoService.class)
@Component
public class SimpleEchoService implements EchoService {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
