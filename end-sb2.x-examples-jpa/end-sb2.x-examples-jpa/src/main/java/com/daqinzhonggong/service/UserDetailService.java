package com.daqinzhonggong.service;

import com.daqinzhonggong.model.UserDetail;
import com.daqinzhonggong.param.UserDetailParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserDetailService {
    public Page<UserDetail> findByCondition(UserDetailParam detailParam, Pageable pageable);
}
