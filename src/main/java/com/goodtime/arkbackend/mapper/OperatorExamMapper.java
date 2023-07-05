package com.goodtime.arkbackend.mapper;

import com.goodtime.arkbackend.entity.OperatorExam;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface OperatorExamMapper {
    @Select("select * from operator_exam where id=#{id}")
    OperatorExam selectById(String id);

    @Insert("insert into operator_exam values(#{id}, #{physicalStrength}, #{battlefieldMobility}, #{physiology}, #{tacticalPlanning}, #{combatSkills}, #{originiumArtsAdaptability})")
    int insert(OperatorExam operatorExam);

    @Update("update operator_exam set physical_strength=#{physicalStrength}, battlefield_mobility=#{battlefieldMobility}, physiology=#{physiology}, tactical_planning=#{tacticalPlanning}, combat_skills=#{combatSkills}, originium_arts_adaptability=#{originiumArtsAdaptability} where id=#{id}")
    int changeExam(OperatorExam operatorExam);
}
