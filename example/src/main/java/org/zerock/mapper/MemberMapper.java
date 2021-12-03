package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.MemberDTO;

public interface MemberMapper {

	public void insert(MemberDTO member);
	
	@Select("select *from member")
	public List<MemberDTO> getList();
}
