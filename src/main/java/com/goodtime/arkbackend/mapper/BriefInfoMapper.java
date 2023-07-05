package com.goodtime.arkbackend.mapper;

import com.goodtime.arkbackend.entity.BriefInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BriefInfoMapper {
    @Select("select account.id, account.order, account.name, account.authority, account.compressed_avatar, info.sex, info.birthplace, info.birthday, info.oripathy_infection_status, info.race, info.organization, info.profession from operator_account account, operator_info info where account.id = info.id order by account.order limit #{index}, #{count}")
    List<BriefInfo> getBriefInfoList(Integer index, Integer count);

    @Select("select account.id, account.order, account.name, account.authority, account.compressed_avatar, info.sex, info.birthplace, info.birthday, info.oripathy_infection_status, info.race, info.organization, info.profession from operator_account account, operator_info info where account.id = info.id and account.name=#{name}")
    List<BriefInfo> getBriefInfoListByName(String name);

    @Select("select account.id, account.order, account.name, account.authority, account.compressed_avatar, info.sex, info.birthplace, info.birthday, info.oripathy_infection_status, info.race, info.organization, info.profession from operator_account account, operator_info info where account.id = info.id and info.profession=#{profession}")
    List<BriefInfo> getBriefInfoListByProfession(String profession);
}
