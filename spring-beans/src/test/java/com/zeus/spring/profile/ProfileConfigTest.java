package com.zeus.spring.profile;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author xuxingbo
 * @Date 2018/5/10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ProfileConfig.class)
@ActiveProfiles(profiles = "dev")
public class ProfileConfigTest {
    
    @Autowired
    private ProfileModel profileModel;
    
    @Test
    public void profileTest(){
        Assert.assertNotNull(profileModel);
        Assert.assertEquals("dev", profileModel.getName());
        System.out.println(profileModel);
    }
}