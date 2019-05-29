package com.ldp.springboot.repository;

import com.ldp.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Return
 * @create 2019-05-27 16:27
 */
//继承JpaRepository来完成数据库的操作
public interface UserRepository extends JpaRepository<User,Integer> {
}
