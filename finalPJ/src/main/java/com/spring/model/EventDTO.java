package com.spring.model;

import java.util.Date;

import lombok.Data;


@Data
public class EventDTO {
	
	private int event_no; // 이벤트 번호
	private String event_thumbnail; // 썸네일
	private String event_file1; // 이벤트 사진1
	private String event_file2;
	private String event_file3;

	private String event_cont1;// 이벤트 설명1
	private String event_cont2;
	private String event_cont3;
	
	private Date event_date; // 이벤트 등록일
	private Date event_start; // 이벤트 시작일
	private Date event_end; // 이벤트 종료일
	
	private String event_status; // 이벤트 상태

}
