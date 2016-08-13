package com.github.hustedleo.service.impl;

import com.github.hustedleo.mapper.TokenMapper;
import com.github.hustedleo.model.Token;
import com.github.hustedleo.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DemoService implements IDemoService{

    @Autowired
    private TokenMapper mapper;

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
