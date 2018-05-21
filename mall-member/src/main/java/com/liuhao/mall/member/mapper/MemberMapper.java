package com.liuhao.mall.member.mapper;

import com.liuhao.mall.member.model.Member;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
@Repository
public interface MemberMapper extends Mapper<Member>{
}
