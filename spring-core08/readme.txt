빈의 스코프

스코프
	- 싱글톤
	- 프로토타입
		-- Request
		-- Session
		-- WebSocket
		-- ...
		
프로토타입 빈이 싱글톤 빈을 참조하면??
	- 아무 문제 없음.
	
싱글톤 빈이 프로토타입 빈을 참조하면??
	- 프로토타입 빈이 업데이트가 안되네?
	- 업데이트 하려면
		-- scoped-proxy
		-- Object-Provider
		-- Provider(표준)

	해결하는법! 스코프=프록시, ObjectProvider<Proto>
	
싱글톤 객체 사용시 주의할 점
	- 프로퍼티가 공유. (스레드 세이프 하지 않다)
	- ApplicationContext 초기 구동시 인스턴스 생성.