package com.example.webservice;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.webservice.dto.AddressDto;
import com.example.webservice.dto.PracticeUserDto;

@Repository
public interface AddressUserRepo extends CrudRepository<AddressDto,Long>
{
	List<AddressDto> findAllByUserDetails(PracticeUserDto user);
}
