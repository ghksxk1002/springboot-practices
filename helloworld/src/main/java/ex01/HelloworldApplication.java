package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
/*
 * Bootstraping Class
 * 이 하는 역할
 * 1. 스프링 부트 애플리케이션의 부트스트래핑(Bootstrapping)
 * 2. 설정 class로 역할(Configuration Class)  
 */
@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		/*
		 * run이 실행되면 일어나는일 -->부트스트래핑(Bootstrapping)
		 * 1. 애플리케이션 컨택스트(Application Context, Spring Container 생성)
		 * 2. 타입이 웹애플리케이션이면(Web Application인 경우, MVC or Reactive)
		 * 3. 어노테이션 스캐닝(Auto) or Configuration 클래스(명시적)을 통한 빈 생선 및 등록 작업을 한다 --> 컨테이너가 채워진다
		 * 4. 웹 어플리케이션인 경우 그중에서도 MVC인 경우(톱켓이 필요한 경우 디스페처 서블릿이 필요하다)
		 * 		- 내장(emebedded) 서버(TomcatEmdebeddedServletContainer) 인스턴스 생성
		 * 		- 서버 인스턴스에 웹 애플리케이션을 배포 
		 * 		- 서버 인스턴스를 실행 
		 * 5. 인터페이스 ApplicationRunner 구현 빈의 run() 실행
		 * 
		 */
		
//		ConfigurableApplicationContext c =null;
//		try {
//			c = SpringApplication.run(HelloworldApplication.class, args);
//		} catch (Throwable ex) {
//			ex.printStackTrace();
//		} finally{
//			c.close();
//		}
		
//		try~with~Resource
		try(ConfigurableApplicationContext c = SpringApplication.run(HelloworldApplication.class, args);){
			
		}
	
	}

}
