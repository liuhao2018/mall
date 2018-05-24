package com.liuhao.mall.mall.score.controller;

import com.liuhao.mall.mall.score.model.ApiResponse;
import com.liuhao.mall.mall.score.model.Score;
import com.liuhao.mall.mall.score.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/score")
@RestController
public class ScoreController {

    @Autowired
    public ScoreService scoreService;

    @PostMapping("/action")
    public ApiResponse action(@RequestBody Score score) {
        ApiResponse apiResponse = new ApiResponse();
        int result = scoreService.action(score);
        if (result > 0) {
            return apiResponse;
        }
        apiResponse.setCode(1006);
        apiResponse.setMessage("会员积分失败，请检查后再试");
        return apiResponse;
    }

    @GetMapping("/member/{id}")
    public ApiResponse memberSumScore(@PathVariable("id") Long id){
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setData(scoreService.memberSumScore(id));
        return apiResponse;
    }

}
