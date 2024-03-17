package com.nobroker.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nobroker.entity.User;
import com.nobroker.payload.UserDto;
import com.nobroker.repository.UserRepository;
import com.nobroker.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private UserRepository userRepository;

	@Override
	public long createUser(UserDto userDto) {
		User user = mapToEntity(userDto);
		User savedUser = userRepository.save(user);	
		return savedUser.getId();

	}

	
	User mapToEntity(UserDto userDto) {
		
		User user = new User();
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setMobile(userDto.getMobile());
		user.setPassword(userDto.getPassword());		
		return user;
		
	}
	UserDto mapToDto(User user) {
		UserDto dto=new UserDto();
		dto.setId(user.getId());
		dto.setName(user.getName());
		dto.setEmail(user.getEmail());
		dto.setPassword(user.getPassword());
		
		return null;
		
		
	}

}
