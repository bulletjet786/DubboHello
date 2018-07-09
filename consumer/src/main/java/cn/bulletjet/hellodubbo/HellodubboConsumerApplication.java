package cn.bulletjet.hellodubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class HellodubboConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellodubboConsumerApplication.class, args);
	}
}
