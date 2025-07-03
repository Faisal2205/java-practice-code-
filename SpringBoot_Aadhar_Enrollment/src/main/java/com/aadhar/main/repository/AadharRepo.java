package com.aadhar.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aadhar.main.entity.UserInfo;

public interface AadharRepo extends JpaRepository<UserInfo, Long>{

}
