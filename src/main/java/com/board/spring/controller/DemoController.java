package com.board.spring.controller;

import com.board.spring.constant.Method;
import com.board.spring.domain.DemoDTO;
import com.board.spring.paging.Criteria;
import com.board.spring.service.DemoService;
import com.board.spring.util.UiUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DemoController extends UiUtils {

    @Autowired
    DemoService demoservice;

    @GetMapping(value = "/index.do")
    public String home(@ModelAttribute("criteria") Criteria criteria, Model model) {

        List<DemoDTO> demolist = demoservice.selectDemoList(criteria);
        model.addAttribute("demolist", demolist);

        System.out.println(demolist);

        return "index.jsp";
    }

    @GetMapping(value = "/Regis.do")
    public String EditRegistration(@RequestParam(value = "idx", required = false) Long idx, DemoDTO params, Model model) {

        if(idx == null) {
            model.addAttribute("demo", new DemoDTO());
        } else {
            DemoDTO demo = demoservice.selcetDemoDetail(idx);
            model.addAttribute("demo", demo);
        }

        return "Regis.jsp";
    }

    @PostMapping(value = "/RegisApi")
    public String RegisApi(DemoDTO params, Model model) {
        System.out.println(params);

        boolean result = demoservice.insertDemo(params);

        if(result == false) {

            return "redirect:Regis.do";
        }

        return "redirect:index.do";
    }

    @GetMapping(value = "/view.do")
    public String Detailview(@RequestParam(value = "idx" , required = false) Long idx, Model model) {

        DemoDTO demo = demoservice.selcetDemoDetail(idx);

        model.addAttribute("demo", demo);

        return "view.jsp";
    }

    @PostMapping(value = "/deleteDemo")
    public String deleteApi(@RequestParam("idx") Long idx) {

        if(idx == null) {
            return "redirect:index.do";
        }

        try {
            boolean result = demoservice.deleteDemo(idx);
            if (result == false) {
                return "실패";
            }
        } catch (DataAccessException e) {
            return "데이터베이스 문제";
        } catch (Exception e) {
            return "시스템 문제";
        }
        return "redirect:index.do";
    }
}