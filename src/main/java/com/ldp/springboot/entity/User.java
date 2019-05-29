package com.ldp.springboot.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Return
 * @create 2019-05-27 16:22
 */
//标注他是你一个实体类
//注明这个表的名称
@Entity
@Table(name = "user")
public class User implements Serializable {

    //告诉spring这个为主键，并且为自增
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String password;

    private String sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
