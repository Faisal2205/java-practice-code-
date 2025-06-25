package com.kodewala.main.service;

import org.springframework.stereotype.Service;

import com.kodewala.main.beans.AadharUserInfo;

@Service
public interface IAadharRegistration {

	public boolean doAadharRegistration(AadharUserInfo aadharUserInfo);
}
