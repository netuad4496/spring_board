package com.board.spring.controller;

import com.board.spring.adapter.GsonLocalDateTimeAdapter;
import com.board.spring.domain.CommentDTO;
import com.board.spring.service.CommentService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = { "/comments", "/comments/{idx}" }, method = {RequestMethod.POST, RequestMethod.PATCH})
    public JsonObject registerComment(@PathVariable(value = "idx", required = false) Long idx, @RequestBody final CommentDTO params) {

        JsonObject jsonobj = new JsonObject();

        try {
            boolean isRegistered = commentService.registerComment(params);
            jsonobj.addProperty("result", isRegistered);

        } catch (DataAccessException e) {
            jsonobj.addProperty("message", "데이터베이스 처리 과정 문제가 발생");
        } catch (Exception e) {
            jsonobj.addProperty("message", "시스템에 문제가 발생");
        }

        return jsonobj;
    }

    @GetMapping(value = "/comments/{boardIdx}")
    public JsonObject getCommentList(@PathVariable("boardIdx") Long boardIdx, @ModelAttribute("params") CommentDTO params) {

        JsonObject jsonObj = new JsonObject();

        List<CommentDTO> commentList = commentService.getCommentList(params);
        if (CollectionUtils.isEmpty(commentList) == false) {
            Gson gson = new GsonBuilder().registerTypeAdapter(LocalDateTime.class, new GsonLocalDateTimeAdapter()).create();

            JsonArray jsonArr = gson.toJsonTree(commentList).getAsJsonArray();
            jsonObj.add("commentList", jsonArr);
        }

        return jsonObj;
    }

    @DeleteMapping(value = "/comments/{idx}")
    public JsonObject deleteComment(@PathVariable("idx") final Long idx) {

        JsonObject jsonObj = new JsonObject();

        try {
            boolean isDeleted = commentService.deleteComment(idx);
            jsonObj.addProperty("result", isDeleted);

        } catch (DataAccessException e){

            jsonObj.addProperty("message", "데이터베이스 처리 과정에 문제가 발생하였습니다.");

        } catch (Exception e) {
            jsonObj.addProperty("message", "시스템에 문제가 발생하였습니다.");
        }

        return jsonObj;

    }
}
