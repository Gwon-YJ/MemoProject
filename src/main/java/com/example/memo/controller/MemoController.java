package com.example.memo.controller;

import com.example.memo.Dto.MemoRequestDto;
import com.example.memo.Dto.MemoResponseDto;
import com.example.memo.entity.Memo;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/memos")
public class MemoController {

    // 자료구조가 DB 역할 수행
    private final Map<Long, Memo> memoList = new HashMap<>();

    // 생성
    @PostMapping
    public MemoResponseDto createMemo(@RequestBody MemoRequestDto requestDto) {
        // 식별자가 1씩 증가 하도록 만듦
        Long memoId = memoList.isEmpty() ? 1 : Collections.max(memoList.keySet()) + 1;

        // 요청받은 데이터로 Memo 객체 생성
        Memo memo = new Memo(memoId, requestDto.getTitle(), requestDto.getContents());

        // Inmemory DB에 Memo 저장
        memoList.put(memoId, memo);

        return new MemoResponseDto(memo);
    }

    // 조회
    @PostMapping("/{id}")
    public MemoResponseDto findMemoById(@PathVariable Long id) {
       Memo memo = memoList.get(id);

       return new MemoResponseDto(memo);
    }

    // 수정
    @PutMapping("/{id}")
    public MemoResponseDto updataMemoById(
            @PathVariable Long id,
            @RequestBody MemoRequestDto dto
    ) {
        Memo memo = memoList.get(id);

        memo.update(dto);

        return new MemoResponseDto(memo);
    }

    // 삭제
    @DeleteMapping("/{id}")
    public void deleteMemo(@PathVariable Long id) {

        memoList.remove(id);
    }
}
