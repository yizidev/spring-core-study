ApplicationContext

빈설정 -> 스프링 IoC 컨테이너

스프링 IoC 컨테이너의 역할
	- 빈 인스턴스 생성
	- 의존 관계 설정
	- 빈 제공

[[[	1. XML Schema 설정 bean 주입 ]]]
ApplicationContext
	- ClassPathXmlApplicationContext (ApplicationContext의 구현체중 ClassPath의 XML의 설정 정보를 불러와 ApplicationContext를 구현)
	
[[[	2. 02프로젝트의 xml파일에 하나하나 빈등록의 번거로움 발생	]]]
그리하여 애노테이션의 탄생

<context:component-scan base-package="package"/>
빈 스캐닝은 기본적으로 4가지 애노테이션으로 찾는다

@Component
--확장--
@Controller
@Service
@Repository

class에서 받는법
@Autowired 혹은 @Inject 사용

이후에 빈설정을 자바소스로 작성할수 없을까? 생각한 끝에 탄생

[[[	3. 자바컨피그설정 ]]]

ApplicationContext
	- AnnotationConfigApplicationContext 를 사용