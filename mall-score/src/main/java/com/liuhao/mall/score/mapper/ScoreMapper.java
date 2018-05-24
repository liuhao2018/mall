package com.liuhao.mall.mall.score.mapper;

import com.liuhao.mall.mall.score.model.Score;
import com.liuhao.mall.mall.score.model.SumScore;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
@Repository
public interface ScoreMapper extends Mapper<Score> {

    @Select("SELECT SUM(action) as total FROM score WHERE user_id = #{id}")
    SumScore memberSumScore(Long id);

}
