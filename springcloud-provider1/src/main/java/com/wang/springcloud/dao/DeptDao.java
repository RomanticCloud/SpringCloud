package com.wang.springcloud.dao;

import com.wang.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {
    int addDept(Dept dept);

    Dept queryById(Long id);

    List<Dept> queryAll();
}
