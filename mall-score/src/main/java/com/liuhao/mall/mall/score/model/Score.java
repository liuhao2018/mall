package com.liuhao.mall.mall.score.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Score {
    @Id
    private Long id;
    @Column(name = "member_id")
    private String memberId;
    private int action;

    public Score() {
    }

    public Score(Long id, String memberId, int action) {
        this.id = id;
        this.memberId = memberId;
        this.action = action;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", memberId='" + memberId + '\'' +
                ", action=" + action +
                '}';
    }
}
