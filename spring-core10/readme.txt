MessageSource

국제화(i18n) 기능을 제공하는 인터페이스
	- getMessage(String code, Object[] args, String, default, Locale, Ico)
	- ...

스프링 부트를 사용한다면 별다른 설정 필요없이 message.properties 사용할 수 있음
	- message.properteis
	- message_ko_kr.properties
	- ...
	
릴로딩 기능이 있는 메시지 소스 사용하기