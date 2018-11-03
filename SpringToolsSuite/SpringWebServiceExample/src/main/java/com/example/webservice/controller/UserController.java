package com.example.webservice.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webservice.dto.AddressDto;
import com.example.webservice.dto.PracticeUserDto;
import com.example.webservice.model.PracticeUserDetails;
import com.example.webservice.response.AddressResponse;
import com.example.webservice.response.PracticeUserResponse;
import com.example.webservice.response.PracticeUserResponseById;
import com.example.webservice.service.AddressService;
import com.example.webservice.service.PracticeUsersService;
import com.example.webservice.serviceImplementation.PracticeUsersServiceImplementation;

@RestController
@RequestMapping("practiceusers")
public class UserController{
	
	@Autowired
	PracticeUsersService practiceUser;
	@Autowired
	AddressService userAddress;
	static Logger log=Logger.getLogger(UserController.class);
	/*@GetMapping(path="/{email}")
	public PracticeUserResponse getUsers(@PathVariable String email) {
		PracticeUserResponse response=new PracticeUserResponse();
		PracticeUserDto userdto=new PracticeUserDto();
		userdto=practiceUser.getUser(email);
		BeanUtils.copyProperties(userdto, response);
		return response;
	}*/
	@GetMapping
	public List<PracticeUserDto> getUsers() {
		List<PracticeUserResponse> response=new ArrayList<PracticeUserResponse>();
		
		
		
		
		
		return practiceUser.getUsers();
	}
	
	
	
	@GetMapping(path="/{userId}") 
	public PracticeUserResponse getUserByUserId(@PathVariable String userId) {
		log.info("INTO GET MAPPING");
		PracticeUserResponse response=new PracticeUserResponse();
		PracticeUserDto userdto=new PracticeUserDto();
		
		userdto=practiceUser.getUsersById(userId);
		BeanUtils.copyProperties(userdto, response);
		return response;
	}
	
@GetMapping(path="/{userName}/addresses")
	public List<AddressResponse> getAddressByUserName(@PathVariable String userName ) {
		List<AddressResponse> response =new ArrayList<>();
		
		List<AddressDto> useraddresses=userAddress.getUserAddressByName(userName); 
		java.lang.reflect.Type listType=new TypeToken<List<AddressResponse>>() {}.getType();
		response=new ModelMapper().map(useraddresses, listType);
 		return response;
		
	}
	
    @PostMapping
    public PracticeUserResponse createUser(@RequestBody PracticeUserDetails pcuserdetails) {
    	PracticeUserResponse response=new PracticeUserResponse();
    	PracticeUserDto userdto;
    	/*BeanUtils.copyProperties(pcuserdetails,userdto);*/
    	
    	ModelMapper modelMapper = new ModelMapper();
    	userdto=modelMapper.map(pcuserdetails, PracticeUserDto.class);
    	//BeanUtils.copyProperties(practiceUser.createPracticeUser(userdto), response);
    	response=modelMapper.map(practiceUser.createPracticeUser(userdto), PracticeUserResponse.class);
    	return response;
		
	}
    @PutMapping(path="/{userId}")
	public PracticeUserResponse updateUser(@PathVariable String userId,@RequestBody PracticeUserDetails pcuserdetails) {
    	PracticeUserResponse response=new PracticeUserResponse();
    	PracticeUserDto userdto=new PracticeUserDto();
    	BeanUtils.copyProperties(pcuserdetails, userdto);
    	practiceUser.updateUser(userId, userdto);
    	BeanUtils.copyProperties(practiceUser.updateUser(userId, userdto),response);
    	return response;
		
	}
    @DeleteMapping(path="/{userId}")
	public String deleteUser(@PathVariable String userId) {
    	
    	PracticeUserDto userdto=new PracticeUserDto();
    	
    	practiceUser.deleteUserDto(userId);
    	
    	return "success";
		
	}
	
	
	
}
