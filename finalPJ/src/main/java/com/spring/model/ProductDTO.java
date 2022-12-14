package com.spring.model;

import java.util.Date;

import lombok.Data;

@Data
public class ProductDTO {
	private int product_no; // 상품번호
	private String product_name; // 상품이름
	private String product_category; // 상품 카테고리
	private String product_company; // 상품 제조사
	
	private int product_alcohol; // 도수
	private String product_flavor; // 맛 .. 신맛, 단맛
	private int product_soda; // 탄산 .. 약(1),중(2),강(3)
	private String product_material; // 원료 .. 꽃, 곡물, 야채, 과일, 기타
	
	private int product_price; // 상품 판매가
	private int product_stock; // 상품 재고수량
	private int product_point; // 상품 포인트
	private String product_thumbnail; // 상품 썸네일
	private String product_status; // 상품 상태 기본값:판매 .. 품절, 종료
	private Date product_date; // 상품 등록일
	
}
