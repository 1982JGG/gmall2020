package com.jgg.gmall.user.controller;

import com.jgg.gmall.bean.UmsMemberReceiveAddress;
import com.jgg.gmall.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author JGG
 * @create 2020/4/10 21:14
 */
@Controller
@ResponseBody
public class UmsMemberReceiveAddressController {
    @Autowired
    UmsMemberReceiveAddressService umsMemberReceiveAddressService;
    @GetMapping("userAddress/{memberId}")
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByMemberId(@PathVariable("memberId") Integer memberId){
        return umsMemberReceiveAddressService.getUmsMemberReceiveAddressByMemberId(memberId);
    }
}
