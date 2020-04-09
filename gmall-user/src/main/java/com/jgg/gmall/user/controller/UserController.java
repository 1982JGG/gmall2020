package com.jgg.gmall.user.controller;

import com.jgg.gmall.bean.UmsMember;
import com.jgg.gmall.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author JGG
 * @create 2020/4/9 22:25
 */
@Controller
@ResponseBody
public class UserController {
    @Autowired
    UmsMemberService umsMemberService;
    @GetMapping("user/{id}")
    public UmsMember getUmsMemberById(@PathVariable("id") Integer id){

        return umsMemberService.getUmsMemberById(id);
    }
}
