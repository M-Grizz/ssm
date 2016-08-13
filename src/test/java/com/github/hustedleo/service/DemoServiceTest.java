package com.github.hustedleo.service;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class DemoServiceTest {

    @Resource
    private IDemoService demoService;

    @Test
    public void sayHelloTest() {

        String msg = demoService.sayHello("张三");
        Assert.assertEquals("hello 张三", msg);

    }


}
