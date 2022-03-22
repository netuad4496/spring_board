package com.board.spring.service;

import com.board.spring.domain.BoardDTO;
import com.board.spring.domain.DemoDTO;
import com.board.spring.mapper.DemoMapper;
import com.board.spring.paging.Criteria;
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
        } else {
            queryResult = demoMapper.updateDemo(params);
        }

        return (queryResult == 1)? true : false;
    }

    public boolean deleteDemo(Long idx) {
        int queryResult = 0;

        queryResult = demoMapper.deleteDemo(idx);

        return (queryResult == 1)? true : false;
    }

    public List<DemoDTO> selectDemoList(Criteria criteria) {
        List<DemoDTO> demoList = Collections.emptyList();

        demoList = demoMapper.selectList(criteria);

        return demoList;
    }

    public DemoDTO selcetDemoDetail(Long idx) {
        return demoMapper.selectDetail(idx);
    }

}
