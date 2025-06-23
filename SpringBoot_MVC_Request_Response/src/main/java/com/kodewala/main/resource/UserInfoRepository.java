package com.kodewala.main.resource;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodewala.main.beans.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo,String> {

}
