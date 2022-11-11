package com.gyh.resume.mapper;

import com.gyh.resume.entity.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDetailMapper {


    UserDetail getUserDetail(int id);


}
