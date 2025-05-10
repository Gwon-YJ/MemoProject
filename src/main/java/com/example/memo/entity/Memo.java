package com.example.memo.entity;

import com.example.memo.Dto.MemoRequestDto;
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


    // 기능
     public void update(MemoRequestDto dto) {
            this.title = dto.getTitle();
            this.contents = dto.getContents();
        }
        public void updateTitle(MemoRequestDto dto) {
            this.title = dto.getTitle();
        }
}

