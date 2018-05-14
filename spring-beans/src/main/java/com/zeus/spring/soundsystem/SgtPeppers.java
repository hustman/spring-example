package com.zeus.spring.soundsystem;

import org.springframework.stereotype.Component;

/**
 * @author xuxingbo
 * @Date 2018/5/8
 */
@Component
public class SgtPeppers implements CompactDisc {
    
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";
    
    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
