package com.goodtime.arkbackend.entity;

public class OperatorAccount {
    private Integer order;
    private String id;
    private String name;
    private String password;
    private Integer authority;
    private String avatar;

    private String compressedAvatar;

    private String identificationCode;

    public OperatorAccount(Integer order, String id, String name, String password, Integer authority, String avatar, String compressedAvatar, String identificationCode) {
        this.order = order;
        this.id = id;
        this.password = password;
        this.name = name;
        this.authority = authority;
        this.avatar = avatar;
        this.compressedAvatar = compressedAvatar;
        this.identificationCode = identificationCode;
    }

    public OperatorAccount(String id, String name, String password,  Integer authority, String avatar, String compressedAvatar, String identificationCode) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.authority = authority;
        this.avatar = avatar;
        this.compressedAvatar = compressedAvatar;
        this.identificationCode = identificationCode;
    }

    public OperatorAccount(String id, String name, String password,  Integer authority, String compressedAvatar, String identificationCode) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.authority = authority;
        this.compressedAvatar = compressedAvatar;
        this.identificationCode = identificationCode;

    }


    public OperatorAccount() {
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getCompressedAvatar() {
        return compressedAvatar;
    }

    public void setCompressedAvatar(String compressedAvatar) {
        this.compressedAvatar = compressedAvatar;
    }

    public String getIdentificationCode() {
        return identificationCode;
    }

    public void setIdentificationCode(String identificationCode) {
        this.identificationCode = identificationCode;
    }

    @Override
    public String toString() {
        return "OperatorAccount{" +
                "order=" + order +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", authority=" + authority +
                ", identificationCode='" + identificationCode + '\'' +
                '}';
    }
}
