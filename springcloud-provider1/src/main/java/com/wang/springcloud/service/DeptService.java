package com.wang.springcloud.service;

import com.wang.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {
    int addDept(Dept dept);

    Dept queryById(Long id);

    List<Dept> queryAll();
}
