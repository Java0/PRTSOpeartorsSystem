package com.goodtime.arkbackend.mapper;

import com.goodtime.arkbackend.entity.OperatorAccount;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface OperatorAccountMapper {

    @Insert("insert into operator_account values(null, #{id}, #{name}, #{password}, #{authority}, #{avatar}, #{compressedAvatar}, #{identificationCode})")
    int insert(OperatorAccount operatorAccount);

    @Select("select count(id) from operator_account")
    int getOperatorsCount();

    @Select("select `order`, id, name, authority, avatar from operator_account where id=#{id}")
    OperatorAccount getAccountById(String id);

    @Select("select password from operator_account where id=#{id}")
    String getPasswordById(String id);

    @Select("select * from operator_account where name=#{name}")
    OperatorAccount getAccountByName(String name);

    @Select("select id from operator_account where name=#{name}")
    String getAccountIdByName(String name);

    @Select("select identification_code from operator_account where id=#{id}")
    String getIdentificationCodeById(String id);

    @Select("select avatar from operator_account where name=#{name}")
    String getAvatarByName(String name);

    @Select("select avatar from operator_account where id=#{id}")
    String getAvatarById(String id);

    @Update("update operator_account set avatar=#{avatar}, compressed_avatar=#{compressedAvatar} where id=#{id}")
    int changeAvatar(String id, String avatar, String compressedAvatar);

    @Update("update operator_account set authority=#{authority} where id=#{id}")
    int changeAuthorityById(String id, int authority);

    @Update("update operator_account set identification_code=#{identificationCode} where id=#{id}")
    int changeIdentificationCodeById(String id, String identificationCode);


}
