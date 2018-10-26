package com.example.webservice;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.webservice.dto.PracticeUserDto;

@Repository
public interface PracticeUserRepo extends CrudRepository<PracticeUserDto,Long> {
	PracticeUserDto findByEmail(String email);
	PracticeUserDto findByUserId(String id);

	                 
}
