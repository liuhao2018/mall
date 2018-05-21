package com.liuhao.mall.mall.score.service;

import com.liuhao.mall.mall.score.mapper.ScoreMapper;
import com.liuhao.mall.mall.score.model.Score;
import org.springframework.stereotype.Service;

@Service
public class ScoreServiceImpl implements ScoreService {

    public ScoreMapper scoreMapper;

    @Override
    public int action(Score score) {
        return scoreMapper.insertSelective(score);
    }

    @Override
    public int memberSumScore(Long id) {
        return scoreMapper.memberSumScore(id);
    }
}
