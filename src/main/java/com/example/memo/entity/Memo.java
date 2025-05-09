package com.example.memo.entity;

import com.example.memo.Dto.MemoRequestDto;
import com.example.memo.Dto.MemoResponseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Memo {

    // 속성
    private Long id;
    private String title;
    private String contents;

    // 생성자
    public void update(MemoRequestDto dto) {
        this.title = dto.getTitle();
        this.contents = dto.getContents();

    // 기능
    }
}

