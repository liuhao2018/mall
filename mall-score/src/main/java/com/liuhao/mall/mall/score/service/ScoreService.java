package com.liuhao.mall.mall.score.service;

import com.liuhao.mall.mall.score.model.Score;

public interface ScoreService {

    int action(Score score);
    int memberSumScore(Long id);

}
