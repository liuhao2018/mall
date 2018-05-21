package com.liuhao.mall.member.model;

import java.util.List;

public class MemberArrayWrapper {
    private List<Member> members;

    public MemberArrayWrapper() {
    }

    public MemberArrayWrapper(List<Member> members) {
        this.members = members;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "MemberArrayWrapper{" +
                "members=" + members +
                '}';
    }
}
