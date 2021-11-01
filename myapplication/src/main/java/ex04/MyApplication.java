package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
 * 
 * @SpringBootApplication 이걸 메타 어노테이션이라고 한다 --> 여러 어노테이션을 가지고 있는 어노테이션
 * 
 * @SpringBootConfiguration(cf. 같은 페키지에서 @configuration 을 달고있는 클래스 찾아옴)
 * @CompoenentScan 이 어노테이션이 붙은 클래스 하위의 모든 컨포넌트를 다 스켄
 * @EnableConfiguration
 * 
 */
@SpringBootApplication
public class MyApplication {
	public static void main(String[] args) {
		try(ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args);){	
		};
	}
}
