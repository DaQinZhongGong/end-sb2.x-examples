package com.daqinzhonggong.sevice.impl;

import com.daqinzhonggong.dao.UserInfoDao;
import com.daqinzhonggong.model.UserInfo;
import com.daqinzhonggong.sevice.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}