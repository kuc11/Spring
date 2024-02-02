package com.example.mavenTest.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// 이메일, 패스워드, 이름, 연락처 데이터를 저장하기위한 클래스

@Getter
@Setter
@Data	
public class memberDTO {
	private String email;
	private String pin;
	private String name;
	private String tel; 
}


// 데이터와 관련 있는 클래스들을 지칭하는 용어
// DTO(Data Transfer Object - 읽기전용(한 번 저장되있는 데이터를 변경하는 용도로 사용하지 않는다), 데이터 전송을 위한 객체(전달 목적)
// VO(Value Object) - 여러 데이터들을 통합하여 다루는 객체, 데이터 가공을 위한 알고리즘 
// ENTITY() - 데이터베이스 테이블과 매핑 되는 객체, 데이터베이스를 다루기 위한 객체이다. 