package com.gyh.resume.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class UserDetail {
    @Getter
    @Setter
    private User user;

    @Getter
    @Setter
    private Desc desc;

    @Getter
    @Setter
    private List<Experience> workExp;

    @Getter
    @Setter
    private List<Experience> projectExp;

    @Getter
    @Setter
    private List<Experience> studyExp;

    @Getter
    @Setter
    private List<Experience> practiceExp;

    @Getter
    @Setter
    private List<Hobby> hobby;

    @Getter
    @Setter
    private List<Honor> honor;

    @Getter
    @Setter
    private List<Certificate> cert;

}

