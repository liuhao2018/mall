package com.liuhao.mall.member.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "member")
public class Member implements Serializable {
    @Id
    private Long id;
    private String name;
    private String mobile;
    @Column(name = "create_date")
    private String createDate;

    public Member() {
    }

    public Member(Long id) {
        this.id = id;
    }

    public Member(String mobile) {
        this.mobile = mobile;
    }

    public Member(Long id, String name, String mobile, String createDate) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.createDate = createDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", createDate='" + createDate + '\'' +
                '}';
    }
}
