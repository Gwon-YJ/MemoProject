package com.example.memo.Dto;

import com.example.memo.entity.Memo;
import lombok.Getter;

@Getter
public class MemoResponseDto {

    // 속성
    private Long id;
    private String title;
    private String contents;

    // 생성자
    // Memo class를 인자로 가지는 생성자
    public MemoResponseDto(Memo memo) {
        this.id = memo.getId();
        this.title = memo.getTitle();
        this.contents = memo.getContents();

    // 기능
    }
}
