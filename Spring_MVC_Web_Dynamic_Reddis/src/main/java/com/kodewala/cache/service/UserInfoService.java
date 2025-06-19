package com.kodewala.cache.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

	@Cacheable("abcd")
	public String getConfirmationMessage(String confirmationNumber) {
        try {
            Thread.sleep(2000); // simulate slow DB call
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Aadhar Registered Successfully with Confirmation Number: " + confirmationNumber;
    }

}
