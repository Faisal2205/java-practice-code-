package com.aadhar.main.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aadhar.main.beans.AadharUserInfo;
import com.aadhar.main.entity.UserInfo;
import com.aadhar.main.exceptions.UserRegistrationException;
import com.aadhar.main.repository.AadharRepo;

@Service
public class AadharRegistrationImp implements IAadharRegistration {
	
	@Autowired
	AadharRepo aadharRepo;

	@Override
	public UserInfo doAadharRegistration(AadharUserInfo aadharUserInfo)
	{
//		boolean isEnroll = false;
		
		String referenceNumber = UUID.randomUUID().toString().substring(0, 8).toUpperCase();
		
		String firstName = aadharUserInfo.getFirstName();
		String lastName = aadharUserInfo.getLastName();
		String mobileNumber = aadharUserInfo.getMobileNumber();
		String address = aadharUserInfo.getAddress();
		
		System.out.println("FirstName: "+ firstName);
		System.out.println("lastName: "+ lastName);
		System.out.println("mobileNumber: "+ mobileNumber);
		System.out.println("address: "+ address);
		
		if (firstName.isEmpty() || lastName.isEmpty() || mobileNumber.isEmpty())
		{
			throw new UserRegistrationException("Missing required fields");
		}

		
		UserInfo userInfo = new UserInfo();
		
		userInfo.setReferenceNumber(referenceNumber);
		userInfo.setFirstName(firstName);
		userInfo.setLastName(lastName);
		userInfo.setMobileNumber(mobileNumber);
		userInfo.setAddress(address);
		
		System.out.println("Reference Number: "+ userInfo.getReferenceNumber());
	
		
		aadharRepo.save(userInfo);
		
		return userInfo;
		
	}
}
