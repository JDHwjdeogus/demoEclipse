package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	/*
	 * 어플리케이션(software 프로그램) 제작 시 3중 구조의 패키지로 시작한다. 개발업계의 암묵적 표준이자 약속.
	 * 패키지 이름은 무조건 전부 소문자
	 * (유사: 변수이름 명사 지정, 함수이름 동사로 지정, 클래스 이름은 맨 앞이 대문자)
		예시: com.example.demo
		com: 도메인 주소의 맨 뒤에 오는 것들(com, net, admin, ...)
		example: 조직이름(dw, naver, google, dnbcode, ...)
		demo: 프로젝트 이름(admin, game, drone, app, ...)
	*/
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}


