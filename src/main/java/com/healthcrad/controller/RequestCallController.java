package com.healthcrad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcrad.dto.RequestCallDto;
import com.healthcrad.service.RequestCallService;

@RequestMapping("/requestCall")
@RestController
@CrossOrigin
public class RequestCallController {
	
	@Autowired
	RequestCallService requestCallService;
	
	//POST API
	@PostMapping("/save")
	public ResponseEntity<RequestCallDto> saveCall(@RequestBody RequestCallDto requestCallDto){
		requestCallService.saveRequestCall(requestCallDto);
		return new ResponseEntity<>(requestCallDto, HttpStatus.CREATED);
	}
	
	//GET API
	@GetMapping("/fetch")
	public ResponseEntity<List<RequestCallDto>> getCallList() {
		List<RequestCallDto> allRequestCall = requestCallService.getAllRequestCall();
		return new ResponseEntity<>(allRequestCall ,HttpStatus.OK);
	}

}
