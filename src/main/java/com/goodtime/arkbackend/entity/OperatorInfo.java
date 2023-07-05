package com.goodtime.arkbackend.entity;

public class OperatorInfo {
    private String id;
    private String sex;
    private String combatExperience;
    private String birthplace;
    private String birthday;
    private Integer height;
    private String race;
    private String profession;
    private String organization;
    private String oripathyInfectionStatus;

    public OperatorInfo(String id, String sex, String combatExperience, String birthplace, String birthday, Integer height, String race, String profession, String organization, String oripathyInfectionStatus) {
        this.id = id;
        this.sex = sex;
        this.combatExperience = combatExperience;
        this.birthplace = birthplace;
        this.birthday = birthday;
        this.height = height;
        this.race = race;
        this.profession = profession;
        this.organization = organization;
        this.oripathyInfectionStatus = oripathyInfectionStatus;
    }

    public OperatorInfo(String id, String sex) {
        this.id = id;
        this.sex = sex;
    }

    public OperatorInfo(String sex, String birthplace, String birthday, String oripathyInfectionStatus) {
        this.sex = sex;
        this.birthplace = birthplace;
        this.birthday = birthday;
        this.oripathyInfectionStatus = oripathyInfectionStatus;
    }

    public OperatorInfo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCombatExperience() {
        return combatExperience;
    }

    public void setCombatExperience(String combatExperience) {
        this.combatExperience = combatExperience;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getOripathyInfectionStatus() {
        return oripathyInfectionStatus;
    }

    public void setOripathyInfectionStatus(String oripathyInfectionStatus) {
        this.oripathyInfectionStatus = oripathyInfectionStatus;
    }

    @Override
    public String toString() {
        return "OperatorInfo{" +
                "id='" + id + '\'' +
                ", sex='" + sex + '\'' +
                ", combatExperience='" + combatExperience + '\'' +
                ", birthplace='" + birthplace + '\'' +
                ", birthday='" + birthday + '\'' +
                ", height=" + height +
                ", race='" + race + '\'' +
                ", profession='" + profession + '\'' +
                ", organization='" + organization + '\'' +
                ", oripathyInfectionStatus='" + oripathyInfectionStatus + '\'' +
                '}';
    }
}
