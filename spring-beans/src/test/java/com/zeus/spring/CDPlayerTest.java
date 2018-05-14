package com.zeus.spring;

import com.zeus.spring.soundsystem.CDPlayer;
import com.zeus.spring.soundsystem.CDPlayerConfig;
import com.zeus.spring.soundsystem.CompactDisc;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xuxingbo
 * @Date 2018/5/8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    
    @Autowired
    private CompactDisc disc;
    
    @Autowired
    private CDPlayer player;
    
    @Test
    public void cdShouldNotBeNull(){
        Assert.assertNotNull(disc);
    }
    
    @Test
    public void cdPlayerShouldNotNull(){
        Assert.assertNotNull(player);
        player.play();
    }
}
