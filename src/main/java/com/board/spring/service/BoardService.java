package com.board.spring.service;

import com.board.spring.domain.BoardDTO;
import com.board.spring.paging.Criteria;

import java.util.List;

public interface BoardService {

    // 생성, 수정
    public boolean registerBoard(BoardDTO params);

    // 게시글 조회
    public BoardDTO getBoardDetail(Long idx);

    // 특정 게시글 조회 후 삭제
    public boolean deleteBoard(Long idx);

    // 전체글 조회
    public List<BoardDTO> getBoardList(BoardDTO params);
}
