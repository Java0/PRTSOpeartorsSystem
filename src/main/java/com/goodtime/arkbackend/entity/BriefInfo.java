package com.goodtime.arkbackend.entity;

public class BriefInfo {
    private String id;
    private Integer order;
    private String name;
    private Integer authority;
    private String compressedAvatar;
    private String sex;
    private String birthplace;
    private String birthday;

    private String oripathyInfectionStatus;
    private String race;

    private String organization;

    private String profession;

    public BriefInfo(String id, Integer order, String name, Integer authority, String compressedAvatar, String sex, String birthplace, String birthday, String oripathyInfectionStatus, String race, String organization, String profession) {
        this.id = id;
        this.order = order;
        this.name = name;
        this.authority = authority;
        this.compressedAvatar = compressedAvatar;
        this.sex = sex;
        this.birthplace = birthplace;
        this.birthday = birthday;
        this.oripathyInfectionStatus = oripathyInfectionStatus;
        this.race = race;
        this.organization = organization;
        this.profession = profession;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAuthority() {
        return authority;
    }

    public void setAuthority(Integer authority) {
        this.authority = authority;
    }

    public String getCompressedAvatar() {
        return compressedAvatar;
    }

    public void setCompressedAvatar(String compressedAvatar) {
        this.compressedAvatar = compressedAvatar;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getbirthplace() {
        return birthplace;
    }

    public void setbirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getOripathyInfectionStatus() {
        return oripathyInfectionStatus;
    }

    public void setOripathyInfectionStatus(String oripathyInfectionStatus) {
        this.oripathyInfectionStatus = oripathyInfectionStatus;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "BriefInfo{" +
                "id='" + id + '\'' +
                ", order=" + order +
                ", name='" + name + '\'' +
                ", authority=" + authority +
                ", compressedAvatar='" + compressedAvatar + '\'' +
                ", sex='" + sex + '\'' +
                ", birthplace='" + birthplace + '\'' +
                ", birthday='" + birthday + '\'' +
                ", oripathyInfectionStatus='" + oripathyInfectionStatus + '\'' +
                ", race='" + race + '\'' +
                ", organization='" + organization + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}
