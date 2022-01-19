package com.board.spring.service;

import com.board.spring.domain.CommentDTO;

import java.util.List;

public interface CommentService {

    public boolean registerComment(CommentDTO params);

    public boolean deleteComment(Long idx);

    public List<CommentDTO> getCommentList(CommentDTO params);

}
