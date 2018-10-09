package com.test01.entity;

import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;

public class Person01 extends SerializableSerializer{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String name;

    private Integer sex;

    private String address;

    private Integer age;

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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}