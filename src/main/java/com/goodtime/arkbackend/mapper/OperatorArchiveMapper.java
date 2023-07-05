package com.goodtime.arkbackend.mapper;

import com.goodtime.arkbackend.entity.OperatorArchive;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface OperatorArchiveMapper {
    @Select("select * from operator_archive where id=#{id}")
    List<OperatorArchive> selectAllById(String id);

    @Select("select * from operator_archive where id=#{id} and `order`=#{order}")
    OperatorArchive selectByIdAndOrder(String id, Integer order);

    @Insert("insert into operator_archive values(#{id}, #{order}, #{title}, #{text})")
    int insert(OperatorArchive operatorArchive);

    @Update("update operator_archive set title=#{title}, text=#{text} where id=#{id} and `order`=#{order}")
    int changeArchiveByIdAndOrder(OperatorArchive archive);
}
