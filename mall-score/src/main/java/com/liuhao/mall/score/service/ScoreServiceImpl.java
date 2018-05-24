package com.liuhao.mall.score.service;

import com.liuhao.mall.score.mapper.ScoreMapper;
import com.liuhao.mall.score.model.Score;
import com.liuhao.mall.score.model.SumScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    public ScoreMapper scoreMapper;

    @Override
    public int action(Score score) {
        return scoreMapper.add(score.getMemberId(),score.getAction());
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
