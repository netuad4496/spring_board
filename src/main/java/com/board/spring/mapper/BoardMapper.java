package com.board.spring.mapper;

import com.board.spring.domain.BoardDTO;
import com.board.spring.paging.Criteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    // 게시글을 생성하는 쿼리를 호출
    public int insertBoard(BoardDTO params);

    // 하나의 게시글 조회
    public BoardDTO selectBoardDetail(Long idx);

    // 게시글 수정
    public int updateBoard(BoardDTO params);

    // 게시글 삭제
    public int deleteBoard(Long idx);

    // 게시글 전체 리스트 목록 조회
    public List<BoardDTO> selectBoardList(BoardDTO params);

    // 삭제여부가 N 으로 지정된 게시글의 개수 조회(페이징 시 필요)
    public int selectBoardTotalCount(BoardDTO params);
}
