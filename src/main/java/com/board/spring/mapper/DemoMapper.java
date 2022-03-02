package com.board.spring.mapper;

import com.board.spring.domain.DemoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DemoMapper {

    public int insertDemo(DemoDTO param);

    public List<DemoDTO> selectList(DemoDTO param);

    public DemoDTO selectDetail(Long idx);
}
