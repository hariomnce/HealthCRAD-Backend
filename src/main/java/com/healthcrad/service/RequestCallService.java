package com.healthcrad.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcrad.dto.RequestCallDto;
import com.healthcrad.entity.RequestCall;
import com.healthcrad.repository.RequestCallRepository;

@Service
public class RequestCallService {

	@Autowired
	RequestCallRepository requestCallRepository;

	@Autowired
	ModelMapper modelMapper;

	// Insert Record in database
	public void saveRequestCall(RequestCallDto requestCallDto) {
		requestCallRepository.save(requestCallDtoToRequestCall(requestCallDto));
	}

	// Show all Record
	public List<RequestCallDto> getAllRequestCall() {
		List<RequestCallDto> listRequestCall = new ArrayList<RequestCallDto>();
		requestCallRepository.findAll().forEach(li -> listRequestCall.add(requestCallToRequestCallDto(li)));
		return listRequestCall;
	}

	// Converting DTO
	public RequestCall requestCallDtoToRequestCall(RequestCallDto requestCallDto) {
		RequestCall requestCall = this.modelMapper.map(requestCallDto, RequestCall.class);
		return requestCall;

	}

	public RequestCallDto requestCallToRequestCallDto(RequestCall requestCall) {
		RequestCallDto requestCallDto = this.modelMapper.map(requestCall, RequestCallDto.class);
		return requestCallDto;

	}

}
