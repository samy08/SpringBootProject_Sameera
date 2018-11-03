package com.example.webservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.webservice.dto.AddressDto;
import com.example.webservice.dto.PracticeUserDto;
 

@Service
public interface AddressService {
	public List<AddressDto> getUserAddressByName(String name);
}
