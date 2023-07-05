package com.goodtime.arkbackend.mapper;

import com.goodtime.arkbackend.entity.OperatorInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface OperatorInfoMapper {

    @Select("select * from operator_info where id=#{id}")
    OperatorInfo selectByID(String id);

    @Insert("insert into operator_info values(#{id}, #{sex}, #{combatExperience}, #{birthplace}, #{birthday}, #{height}, #{race}, #{profession}, #{organization}, #{oripathyInfectionStatus})")
    int insert(OperatorInfo operatorInfo);

    @Update("update operator_info set sex=#{sex}, combat_experience=#{combatExperience}, birthplace=#{birthplace}, birthday=#{birthday}, height=#{height}, race=#{race}, profession=#{profession}, organization=#{organization}, oripathy_infection_status=#{oripathyInfectionStatus} where id=#{id}")
    int changeInfo(OperatorInfo operatorInfo);
}
