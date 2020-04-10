package com.jgg.gmall.user.service.impl;

import com.jgg.gmall.bean.UmsMember;
import com.jgg.gmall.service.UmsMemberService;
import com.jgg.gmall.user.mapper.UmsMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author JGG
 * @create 2020/4/9 23:02
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {
    @Autowired(required = true)
    UmsMemberMapper umsMemberMapper;
    @Override
    public UmsMember getUmsMemberById(Integer id) {
        return umsMemberMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addUmsMember(UmsMember umsMember) {
        return umsMemberMapper.insert(umsMember);
    }

    @Override
    public int updateUmsMember(UmsMember umsMember) {
        return umsMemberMapper.updateByPrimaryKey(umsMember);
    }

    @Override
    public int deleteUmsMemberById(Integer id) {
        return umsMemberMapper.deleteByPrimaryKey(id);
    }
}
