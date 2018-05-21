package com.liuhao.mall.mall.score.mapper;

import com.liuhao.mall.mall.score.model.Score;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
@Repository
public interface ScoreMapper extends Mapper<Score> {

    @Select("select sum(action) from score where user_id = #{id}")
    int memberSumScore(Long id);

}
