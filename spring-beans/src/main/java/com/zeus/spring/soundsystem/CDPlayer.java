package com.zeus.spring.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xuxingbo
 * @Date 2018/5/8
 */
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;
    
    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }
    
    
    @Override
    public void play() {
        cd.play();
    }
}
