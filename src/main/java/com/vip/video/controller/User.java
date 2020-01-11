package com.vip.video.controller;

import lombok.Data;

/**
 * @ClassName User
 * @Author liubaihui
 * @Date 2019/4/24
 * @Version 1.0
 * @Describe
 **/
@Data
public class User {
    @IniterValue(value = "2")
    private Integer age;
    @IniterValue(value = "小明")
    private String name;
}
