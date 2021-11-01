package ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import ex05.component.MyComponent;

/*
 * 
 * Application Context 구성 후, 실행할 코드(Application Context 환경)  가있는경우
 * ApplicatrionRunner 인터페이스 구현 클래스 비 ㄴ생성하기
 * 
 */
@SpringBootApplication
public class MyApplication {
	
	@Bean
	public ApplicationRunner applicationRunner() {

		// 1.작성된 클래스를 사용하는 방법

		// return new HelloWorldRunner();

		// 2. Anonymoser class 사용하는 방법
		return new ApplicationRunner() {

			@Autowired
			private MyComponent myComponent;

			@Override
			public void run(ApplicationArguments args) throws Exception {
				myComponent.printHello();
			}
		};
//		
		//3. 함수형(람다 표현ㅅㄱ)
//		return (args)->{
//			System.out.println("Hello World");
//		};
	}

	public static void main(String[] args) {

		try (ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args);) {
		}
		
	}
}
