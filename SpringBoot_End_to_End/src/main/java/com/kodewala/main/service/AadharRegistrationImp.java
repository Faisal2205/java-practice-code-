package com.kodewala.main.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.main.beans.AadharUserInfo;
import com.kodewala.main.entity.UserInfo;
import com.kodewala.main.repository.AadharRepo;

@Service
public class AadharRegistrationImp implements IAadharRegistration{

	@Autowired
	AadharRepo aadharRepo;
	
	@Override
	public boolean doAadharRegistration(AadharUserInfo aadharUserInfo)
	{
		boolean isEnroll = false;
		
		String referenceNumber = UUID.randomUUID().toString().substring(0, 8).toUpperCase();
		
		String firstName = aadharUserInfo.getFirstName();
		String lastName = aadharUserInfo.getLastName();
		String mobileNumber = aadharUserInfo.getMobileNumber();
		String address = aadharUserInfo.getAddress();
		
		System.out.println("firstName: "+ firstName);
		System.out.println("firstName: "+ lastName);
		System.out.println("firstName: "+ mobileNumber);
		System.out.println("firstName: "+ address);

		UserInfo userInfo = new UserInfo();
		
		userInfo.setReferenceNumber(referenceNumber);
		userInfo.setFirstName(firstName);
		userInfo.setLastName(lastName);
		userInfo.setMobileNumber(mobileNumber);
		userInfo.setAddress(address);

        aadharRepo.save(userInfo);
        
        if(userInfo !=null)
        {
        	isEnroll = true;
        }
		return isEnroll;
	}
}
