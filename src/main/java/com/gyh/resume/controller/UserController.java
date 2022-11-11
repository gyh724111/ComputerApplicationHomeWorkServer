package com.gyh.resume.controller;

import com.gyh.resume.entity.*;
import com.gyh.resume.mapper.UserMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Resource
    UserMapper userMapper;
    UserDetail userDetail = new UserDetail();

    @GetMapping("/listall")
    public List<User> listAll(){
        return userMapper.listAll();
    }

    @GetMapping("/getuser/{user_id}")
    public User getUser(@PathVariable("user_id") Integer user_id){
        return userMapper.getUser(user_id);
    }

    @GetMapping("/getdesc/{user_id}")
    public Desc getDesc(@PathVariable("user_id") Integer user_id){
        return userMapper.getDesc(user_id);
    }

    @GetMapping("/getexp/{type}/{user_id}")
    public List<Experience> getExp(@PathVariable("user_id") Integer user_id,@PathVariable("type") Integer type){
        return userMapper.getExp(user_id,type);
    }

    @GetMapping("/gethonor/{user_id}")
    public List<Honor> getHonor(@PathVariable("user_id") Integer user_id){
        return userMapper.getHonor(user_id);
    }

    @GetMapping("/gethobby/{user_id}")
    public List<Hobby> getHobby(@PathVariable("user_id") Integer user_id){
        return userMapper.getHobby(user_id);
    }

    @GetMapping("/getcert/{user_id}")
    public List<Certificate> getCert(@PathVariable("user_id") Integer user_id){
        return userMapper.getCert(user_id);
    }


    @GetMapping("/getuserdetail/{user_id}")
    public UserDetail getUserDetail(@PathVariable("user_id") Integer user_id){
        userDetail.setUser(this.getUser(user_id));

        userDetail.setDesc(this.getDesc(user_id));

        userDetail.setWorkExp(this.getExp(user_id,0));
        userDetail.setProjectExp(this.getExp(user_id,1));
        userDetail.setPracticeExp(this.getExp(user_id,2));
        userDetail.setStudyExp(this.getExp(user_id,3));

        userDetail.setCert(this.getCert(user_id));
        userDetail.setHobby(this.getHobby(user_id));
        userDetail.setHonor(this.getHonor(user_id));


        return userDetail;
    }

}
