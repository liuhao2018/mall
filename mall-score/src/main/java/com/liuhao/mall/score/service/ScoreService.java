package com.liuhao.mall.score.service;

import com.liuhao.mall.score.model.Score;
import com.liuhao.mall.score.model.SumScore;

public interface ScoreService {

    int action(Score score);
    SumScore memberSumScore(Long id);

}
