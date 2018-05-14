package com.zeus.spring.obvious;


/**
 * @author xuxingbo
 * @Date 2018/5/8
 */
public class CDPlayerObvious implements MediaPlayerObvious {
    private CompactDiscObvious cd;
    
    public CDPlayerObvious(CompactDiscObvious cd){
        this.cd = cd;
    }
    
    
    @Override
    public void play() {
        cd.play();
    }
}
