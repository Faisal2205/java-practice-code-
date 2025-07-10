package com.aadhar.main.services;

import com.aadhar.main.beans.AadharUserInfo;
import com.aadhar.main.entity.UserInfo;

public interface IAadharRegistration {

	public UserInfo doAadharRegistration(AadharUserInfo aadharUserInfo);
}
