package com.wang.springcloud.service;

import com.wang.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {
    @Override
    public DeptClientService create(Throwable cause) {
        return new DeptClientService() {
            @Override
            public int addDept(Dept dept) {
                return 0;
            }

            @Override
            public Dept queryById(Long id) {
                return new Dept()
                        .setDeptno(id)
                        .setDname("id无")
                        .setDb_source("无");
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }
        };
    }
}
