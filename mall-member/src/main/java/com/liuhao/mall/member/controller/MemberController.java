package com.liuhao.mall.member.controller;

import com.liuhao.mall.base.model.ApiResponse;
import com.liuhao.mall.member.model.Member;
import com.liuhao.mall.member.model.MemberArrayWrapper;
import com.liuhao.mall.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/members")
@RestController
public class MemberController {

    @Autowired
    public MemberService memberService;

    @GetMapping("/")
    public ApiResponse findAll() {
        return new ApiResponse(memberService.findAll());
    }

    @GetMapping
    public ApiResponse findByPage(@RequestParam(value = "page_num") int pageNum,
                                  @RequestParam(value = "page_size",required = false,defaultValue = "10") int pageSize) {
        return new ApiResponse(memberService.findByPage(pageNum,pageSize));
    }

    @GetMapping("/id/{id}")
    public ApiResponse findById(@PathVariable("id") Long id) {
        Member member = memberService.findById(id);
        ApiResponse apiResponse = new ApiResponse();
        if (member != null) {
            apiResponse.setData(member);
            return apiResponse;
        }
        apiResponse.setCode(1002);
        apiResponse.setMessage("会员不存在");
        return apiResponse;
    }

    @GetMapping("/mobile/{mobile}")
    public ApiResponse findByMobile(@PathVariable("mobile") String mobile) {
        Member member = memberService.findByMobile(mobile);
        ApiResponse apiResponse = new ApiResponse();
        if (member != null) {
            apiResponse.setData(member);
            return apiResponse;
        }
        apiResponse.setCode(1002);
        apiResponse.setMessage("会员不存在");
        return apiResponse;
    }

    @PostMapping
    public ApiResponse add(@RequestBody MemberArrayWrapper wrapper) {
        int result= memberService.add(wrapper.getMembers());
        ApiResponse apiResponse = new ApiResponse();
        if (result == wrapper.getMembers().size()) {
            return apiResponse;
        }
        apiResponse.setCode(1003);
        apiResponse.setMessage("会员创建异常，请检查后再提交");
        return apiResponse;
    }

    @PutMapping
    public ApiResponse update(@RequestBody Member member) {
        int result = memberService.update(member);
        ApiResponse apiResponse = new ApiResponse();
        if (result > 0) {
            return apiResponse;
        }
        apiResponse.setCode(1004);
        apiResponse.setMessage("会员信息修改失败，请检查后在提交");
        return apiResponse;
    }

    @DeleteMapping("/id/{id}")
    public ApiResponse delete(@PathVariable("id") Long id) {
        int result = memberService.delete(id);
        ApiResponse apiResponse = new ApiResponse();
        if (result > 0) {
            return apiResponse;
        }
        apiResponse.setCode(1005);
        apiResponse.setMessage("会员删除改失败，请检查后再提交");
        return apiResponse;
    }
}
