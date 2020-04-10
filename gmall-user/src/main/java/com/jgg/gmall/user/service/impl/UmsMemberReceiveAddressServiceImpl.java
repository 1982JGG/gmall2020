package com.jgg.gmall.user.service.impl;

import com.jgg.gmall.bean.UmsMemberReceiveAddress;
import com.jgg.gmall.service.UmsMemberReceiveAddressService;
import com.jgg.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author JGG
 * @create 2020/4/10 21:21
 */
@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {
    @Autowired(required = true)
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Override
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByMemberId(Integer memberId) {
        Example example = new Example(UmsMemberReceiveAddress.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("memberId",memberId);
        return umsMemberReceiveAddressMapper.selectByExample(example);
    }

}
