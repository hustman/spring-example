package com.zeus.spring.obvious;

/**
 * @author xuxingbo
 * @Date 2018/5/8
 */
public class SgtPeppersObvious implements CompactDiscObvious {
    
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";
    
    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
