package com.liuhao.mall.mall.score.service;

import com.liuhao.mall.mall.score.mapper.ScoreMapper;
import com.liuhao.mall.mall.score.model.Score;
import com.liuhao.mall.mall.score.model.SumScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    public ScoreMapper scoreMapper;

    @Override
    public int action(Score score) {
        return scoreMapper.insertSelective(score);
    }

    @Override
    public SumScore memberSumScore(Long id) {
        try {
            return scoreMapper.memberSumScore(id);
        }catch (Exception e) {
            return null;
        }

    }
}
