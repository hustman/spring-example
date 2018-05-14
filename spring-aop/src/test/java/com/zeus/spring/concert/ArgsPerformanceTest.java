package com.zeus.spring.concert;

import com.zeus.spring.concert.args.ArgsConcertConfig;
import com.zeus.spring.concert.args.ArgsPerformance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xuxingbo
 * @Date 2018/5/14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ArgsConcertConfig.class)
public class ArgsPerformanceTest {
    
    @Autowired
    public ArgsPerformance performance;
    
    @Test
    public void testArgsPerformance(){
        performance.perform(1);
        performance.perform(2);
    }
}
