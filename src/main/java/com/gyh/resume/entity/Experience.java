package com.gyh.resume.entity;

import lombok.Getter;
import lombok.Setter;

public class Experience {


    @Getter
    @Setter
    private Integer id;

    @Getter
    @Setter
    private Integer user_id;

    @Getter
    @Setter
    private String org_name;

    @Getter
    @Setter
    private Integer seq;

    //  0-工作经验 1-项目经验 2-实习经验 3=教育经验
    @Getter
    @Setter
    private Integer type;

    @Getter
    @Setter
    private String exp;

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String duration;
}
