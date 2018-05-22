package com.liuhao.mall.member.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liuhao.mall.member.mapper.MemberMapper;
import com.liuhao.mall.member.model.Member;
import com.liuhao.mall.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    public MemberMapper memberMapper;

    @Override
    public List<Member> findAll() {
        return memberMapper.selectAll();
    }

    @Override
    public PageInfo findByPage(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Member> members = memberMapper.selectAll();
        return new PageInfo(members);
    }

    @Override
    public Member findById(Long id) {
        return memberMapper.selectByPrimaryKey(id);
    }

    @Override
    public Member findByMobile(String mobile) {
        return memberMapper.selectOne(new Member(mobile));
//        Example example = new Example(Member.class);
//        example.createCriteria().andEqualTo("mobile",mobile);
//        return memberMapper.selectOneByExample(example);
    }

    @Override
    public int add(List<Member> members) {
        List<Integer> results = new ArrayList<>();
        try {
            for (Member member:members) {
                results.add(memberMapper.insertSelective(member));
            }
            return members.size();
        }catch (Exception e) {
            return 0;
        }
    }

    @Override
    public int update(Member member) {
        return memberMapper.updateByPrimaryKeySelective(member);
    }

    @Override
    public int delete(Long id) {
        return memberMapper.deleteByPrimaryKey(id);
    }
}
