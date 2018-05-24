package com.liuhao.mall.score.mapper;

import com.liuhao.mall.score.model.Score;
import com.liuhao.mall.score.model.SumScore;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
@Repository
public interface ScoreMapper extends Mapper<Score> {

    @Select("SELECT SUM(action) as total FROM score WHERE member_id = #{id}")
    SumScore memberSumScore(Long id);

    @Insert("INSERT INTO score (member_id,action) VALUES (#{member_id},#{action})")
    int add(@Param("member_id") Long member_id,@Param("action") int action);

}
