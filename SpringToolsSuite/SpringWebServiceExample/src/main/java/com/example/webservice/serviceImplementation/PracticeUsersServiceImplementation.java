package com.example.webservice.serviceImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webservice.AddressUserRepo;
import com.example.webservice.PracticeUserRepo;
import com.example.webservice.dto.AddressDto;
import com.example.webservice.dto.JourneyDto;
import com.example.webservice.dto.PracticeUserDto;
import com.example.webservice.service.PracticeUsersService;

@Service
public class PracticeUsersServiceImplementation  implements PracticeUsersService{
	
	@Autowired
	PracticeUserRepo userRepo;
	
	

	
	
	@Override
	public PracticeUserDto createPracticeUser(PracticeUserDto user) {
		PracticeUserDto createdUserDetails=new PracticeUserDto();
		for(int i=0;i<user.getAddress().size();i++) {
			AddressDto address=user.getAddress().get(i);
			address.setUserDetails(user);
			address.setAddressId("50");
			user.getAddress().set(i, address);
		}
		 for(int t=0;t<user.getJournies().size();t++) {
			 JourneyDto journies;
			journies=user.getJournies().get(t);
			journies.setUserDetails(user);
			user.getJournies().set(t,journies);
			
		 }
		
		user.setUserId("50");
		
		createdUserDetails=userRepo.save(user);
		
		
		return createdUserDetails;
		
		
	}
	@Override
	public PracticeUserDto getUser(String email) {
		PracticeUserDto fetchedUserDetails=new PracticeUserDto();
		fetchedUserDetails=userRepo.findByEmail(email);
		return fetchedUserDetails;
	}
	@Override
	public PracticeUserDto updateUser(String userId, PracticeUserDto user) {
		PracticeUserDto detailsToUpdate=new PracticeUserDto();
		detailsToUpdate=userRepo.findByUserId(userId);
		detailsToUpdate.setFirstName(user.getFirstName());
		detailsToUpdate.setLastName(user.getLastName());
		detailsToUpdate.setEmail(user.getEmail());
		return detailsToUpdate;
	}
	@Override
	public String deleteUserDto(String userId) {
		// TODO Auto-generated method stub
		PracticeUserDto detailsToDelete=new PracticeUserDto();
		detailsToDelete=userRepo.findByUserId(userId);
		userRepo.delete(detailsToDelete);
	
		return "success" ;
	}
	@Override
	public PracticeUserDto getUsersById(String userId) {
		PracticeUserDto fetchedUserDetails=new PracticeUserDto();
		fetchedUserDetails=userRepo.findByUserId(userId);
		return fetchedUserDetails;
	}
	@Override
	public List<PracticeUserDto> getUsers() {
		List<PracticeUserDto>  list=new ArrayList<PracticeUserDto>();
		for(PracticeUserDto dt:userRepo.findAll()){
		 
			list.add(dt);
		}
		System.out.println("**************** list of users*********"+list );
		return list;
	}
	
	@Override
	public PracticeUserDto getUserById(long id) {
		// TODO Auto-generated method stub
		
		PracticeUserDto userById=new PracticeUserDto();
		userById=userRepo.findById(id);
		return userById;
	}
	

}
