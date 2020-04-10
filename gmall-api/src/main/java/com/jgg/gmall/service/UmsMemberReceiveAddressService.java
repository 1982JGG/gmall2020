package com.jgg.gmall.service;

import com.jgg.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author JGG
 * @create 2020/4/10 21:20
 */
public interface UmsMemberReceiveAddressService {
    List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByMemberId(Integer memberId);
}
