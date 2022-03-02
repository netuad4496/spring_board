package com.board.spring.controller;

import com.board.spring.constant.Method;
import com.board.spring.domain.DemoDTO;
import com.board.spring.service.DemoService;
import com.board.spring.util.UiUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DemoController extends UiUtils {

    @Autowired
    DemoService demoservice;

    @GetMapping(value = "/index.do")
    public String home(DemoDTO params, Model model) {

        List<DemoDTO> demolist = demoservice.selectDemoList(params);
        model.addAttribute("demolist", demolist);

        System.out.println(demolist);

        return "index.jsp";
    }

    @GetMapping(value = "/Regis.do")
    public String EditRegistration(DemoDTO params, Model model) {

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
}