package com.zeus.spring.profile;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author xuxingbo
 * @Date 2018/5/10
 */
@Data
@AllArgsConstructor
public class ProfileModel {
    
    private String name;
    
    private Integer value;
}
