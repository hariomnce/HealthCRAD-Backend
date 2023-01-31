package com.healthcrad.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RequestCallDto {
	
	private int id;
	private String name;
	private String phoneNumber;
	private String emailId;
	private String address;
	private String pinCode;

}
