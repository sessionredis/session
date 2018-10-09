package com.test01.entity;

public class Students {
    private Integer id;

    private String name;

    private Integer age;

    private String classesId;

    private Double scores;

    private String sex;

    private String homeAddress;

    private String phone;

    private String subject;

    private String sumScores;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getClassesId() {
        return classesId;
    }

    public void setClassesId(String classesId) {
        this.classesId = classesId == null ? null : classesId.trim();
    }

    public Double getScores() {
        return scores;
    }

    public void setScores(Double scores) {
        this.scores = scores;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress == null ? null : homeAddress.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getSumScores() {
        return sumScores;
    }

    public void setSumScores(String sumScores) {
        this.sumScores = sumScores == null ? null : sumScores.trim();
    }
}