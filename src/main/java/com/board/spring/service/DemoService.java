package com.board.spring.service;

import com.board.spring.domain.BoardDTO;
import com.board.spring.domain.DemoDTO;
import com.board.spring.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class DemoService {

    @Autowired
    DemoMapper demoMapper;

    public boolean insertDemo(DemoDTO params) {
        int queryResult = 0;

        if (params.getIdx() == null) {
            queryResult = demoMapper.insertDemo(params);
        }

        return (queryResult == 1)? true : false;
    }

    public List<DemoDTO> selectDemoList(DemoDTO params) {
        List<DemoDTO> demoList = Collections.emptyList();

        demoList = demoMapper.selectList(params);

        return demoList;
    }

    public DemoDTO selcetDemoDetail(Long idx) {
        return demoMapper.selectDetail(idx);
    }

}
