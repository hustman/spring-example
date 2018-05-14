package com.zeus.spring;

import com.zeus.spring.model.ConfigHolder;
import com.zeus.spring.model.ModelConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xuxingbo
 * @Date 2018/5/10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ModelConfig.class)
public class ConfigHolderTest {
   
    @Autowired
    private ConfigHolder configHolder;
    
    @Test
    public void test(){
        Assert.assertNotNull(configHolder);
        System.out.println(configHolder.get());
    }
}
