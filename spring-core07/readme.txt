@Component와 컴포넌트 스캔

컴포넌트 스캔 주요 기능
	- 스캔 위치 설정
	- 필터: 어떤 애노테이션을 스캔 할지 또는 하지 않을지
	
@Component
	- @Repository
	- @Service
	- @Controller
	- @Configuration

동작 원리
	- @ComponentScan은 스캔할 패키지와 애노테이션에 대한 정보
	- 실제 스캐닝은 ConfigurationClassPostProssesor라는 BeanFactoryPostProcessor에 의해 처리됨.
	
** 구동 성능 향상 **
펑션을 사용한 빈 등록

public static void main(String[] args) {
	new SpringApplcationBuilder()
		.sources(Applcation.class)
		.initializers( ApplicationContextInitializer<GenericApplicationContext>)
applicationContext -> {
		applicationContext.registerBean(MyBean.class);
	})
	.run(args);
}