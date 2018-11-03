package com.example.webservice;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


import com.example.webservice.dto.PracticeUserDto;

@Repository
public interface PracticeUserRepo extends PagingAndSortingRepository<PracticeUserDto,Long> {
	PracticeUserDto findByEmail(String email);
	PracticeUserDto findByUserId(String id);
	PracticeUserDto findById(long id);
	
	PracticeUserDto findByLastName(String id);
	                 
}
