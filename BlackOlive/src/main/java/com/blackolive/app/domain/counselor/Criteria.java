package com.blackolive.app.domain.counselor;

import org.springframework.web.util.UriComponentsBuilder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Criteria {
	
	private int pageNum;	//현재 페이지 번호
	private int amount;		//한 페이지에 출력할 게시글 수
	
	private String keyword; // 검색어
	
	public Criteria() {
		this(1, 10);
	}
	
	public Criteria(int pageNum, int amount) {
		super();
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
	// ?pageNum=1&amount=10&keyword=홍길동
	public String getListLink() {
		UriComponentsBuilder builder = UriComponentsBuilder.fromPath("")
				.queryParam("pageNum", this.getPageNum())
				.queryParam("amount", this.getAmount())
				.queryParam("keyword", this.keyword);
		return builder.toUriString();
	}
	

	
}
