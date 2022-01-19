package com.board.spring.mapper;

import com.board.spring.domain.CommentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    // 댓글 삽입
    public int insertComment(CommentDTO params);

    // 내용 상세 조회(상세 내용은 필요없지만 댓글 삭제 처리에 해당 메서드 사용)
    public CommentDTO selectCommentDetail(Long idx);

    // 댓글 수정
    public int updateComment(CommentDTO params);

    // 댓글 삭제
    public int deleteComment(Long idx);

    // 특정 게시글에 포함된 댓글 목록 조회
    public List<CommentDTO> selectCommentList(CommentDTO params);

    // 댓글 갯수 조회
    public int selectCommentTotalCount(CommentDTO params);

}
