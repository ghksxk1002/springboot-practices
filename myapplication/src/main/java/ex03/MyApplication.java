package ex03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootConfiguration
@ComponentScan					//하부에있는 컴포넌트를 자동으로 스켄하기 위한 어노테이션
public class MyApplication {
	public static void main(String[] args) {
		try(ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args);){	
		};
	}
}
