package com.board.spring.mapper;

import com.board.spring.domain.AttachDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AttachMapper {

    public int insertAttach(List<AttachDTO> attachList);

    public AttachDTO selectAttachDetail(Long idx);

    public int deleteAttach(Long boardIdx);

    public List<AttachDTO> selectAttachList(Long boardIdx);

    public int selectAttachTotalCount(Long boardIdx);

}
