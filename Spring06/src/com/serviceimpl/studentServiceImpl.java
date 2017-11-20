package com.serviceimpl;

import com.service.SdudenService;

public class studentServiceImpl implements SdudenService{
    @Override
    public void addStudent(String name) {
        System.out.println("添加了学生：+name");
    }
}
