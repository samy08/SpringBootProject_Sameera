package com.example.webservice.serviceImplementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webservice.AddressUserRepo;
import com.example.webservice.PracticeUserRepo;
import com.example.webservice.dto.AddressDto;
import com.example.webservice.dto.PracticeUserDto;
import com.example.webservice.service.AddressService;

@Service
public class AddressServiceImplementation implements AddressService {

	@Autowired
	PracticeUserRepo userRepo;
	
	@Autowired
	AddressUserRepo addressRepo;
	@Override
	public List<AddressDto> getUserAddressByName(String name) {
		// TODO Auto-generated method stub
		
		
			List<AddressDto> useraddress=new ArrayList<>();
			
			PracticeUserDto userdeatilsByName=userRepo.findByLastName(name);
			long id=userdeatilsByName.getId();
			
			if(userdeatilsByName==null)
				return useraddress;
			Iterable<AddressDto> address=addressRepo.findAllByUserDetails(userdeatilsByName);
			for(AddressDto addressDto:address) {
				useraddress.add(addressDto);
			}
			return useraddress;
		
	}

}
