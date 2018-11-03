package com.example.webservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.webservice.dto.PracticeUserDto;

@Service
public interface PracticeUsersService {
public PracticeUserDto createPracticeUser(PracticeUserDto user);
public PracticeUserDto getUser(String email);
public PracticeUserDto getUsersById(String userId);
public List<PracticeUserDto> getUsers();

public PracticeUserDto getUserById(long id);

public PracticeUserDto updateUser(String userId,PracticeUserDto user);
public String deleteUserDto(String id);

}
 