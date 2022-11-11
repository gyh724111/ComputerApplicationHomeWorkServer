package com.gyh.resume.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class User {
    @Getter
    @Setter
    private  Integer id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String job;

    @Getter
    @Setter
    private Integer sex;

    @Getter
    @Setter
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    protected Date birth;

    @Getter
    @Setter
    private String tel;

    @Getter
    @Setter
    private String desc;

    @Getter
    @Setter
    private String mail;

    @Getter
    @Setter
    private String type;
}
