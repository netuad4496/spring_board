package com.board.spring.mapper;

import com.board.spring.domain.DemoDTO;
import com.board.spring.paging.Criteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DemoMapper {

    public int insertDemo(DemoDTO param);

    public List<DemoDTO> selectList(Criteria criteria);

    public int selectDemoCount(Criteria criteria);

    public DemoDTO selectDetail(Long idx);

    public int updateDemo(DemoDTO pamam);

    public int deleteDemo(Long idx);
}
