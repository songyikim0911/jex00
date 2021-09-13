package com.example.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

    @Select("select now()")//세미콜론 안들어가는것 주의!!

    String getTime();

}
