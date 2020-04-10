package com.jgg.gmall.service;

import com.jgg.gmall.bean.UmsMember;

public interface UmsMemberService {

    UmsMember getUmsMemberById(Integer id);

    int addUmsMember(UmsMember umsMember);

    int updateUmsMember(UmsMember umsMember);

    int deleteUmsMemberById(Integer id);
}
