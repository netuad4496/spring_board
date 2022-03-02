package com.board.spring.service;

import com.board.spring.domain.BoardDTO;
import com.board.spring.paging.Criteria;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface BoardService {

    // 생성, 수정
    public boolean registerBoard(BoardDTO params);

    // 파일 생성, 수정(오버로딩 : 코드와 같이, 파라미터의 타입 또는 개수를 다르게 해서 메서드를 선언)
    public boolean registerBoard(BoardDTO params, MultipartFile[] files);

    // 게시글 조회
    public BoardDTO getBoardDetail(Long idx);

    // 특정 게시글 조회 후 삭제
    public boolean deleteBoard(Long idx);

    // 전체글 조회
    public List<BoardDTO> getBoardList(BoardDTO params);
}
