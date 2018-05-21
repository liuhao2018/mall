package com.liuhao.mall.member.service;

import com.github.pagehelper.PageInfo;
import com.liuhao.mall.member.model.Member;

import java.util.List;

public interface MemberService {
    List<Member> findAll();
    PageInfo findByPage(int pageNum, int pageSize);
    Member findById(Long id);
    Member findByMobile(String mobile);

    int add(List<Member> members);
    int update(Member member);
    int delete(Long id);

}
