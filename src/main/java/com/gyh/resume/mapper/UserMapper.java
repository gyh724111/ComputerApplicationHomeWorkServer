package com.gyh.resume.mapper;

import com.gyh.resume.entity.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from user where is_deleted != 1;")
    List<User> listAll();

    @Select("select * from user where is_deleted != 1 and id = #{id};")
    User getUser(int id);

    @Select("select * from `desc` where is_deleted != 1 and user_id = #{id};")
    Desc getDesc(int id);

    @Select("select * from exp where is_deleted != 1 and user_id = #{id} and type = #{type} order by seq asc;")
    List<Experience> getExp(@Param("id") int id,@Param("type") int type);

    @Select("select * from hobby where is_deleted != 1 and user_id = #{id};")
    List<Hobby> getHobby(int id);

    @Select("select * from honor where is_deleted != 1 and user_id = #{id};")
    List<Honor> getHonor(int id);

    @Select("select * from cert where is_deleted != 1 and user_id = #{id};")
    List<Certificate> getCert(int id);

}
