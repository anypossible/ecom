package com.includio.ecom.backend.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.includio.ecom.infrastructure.domain.User;
import com.includio.ecom.infrastructure.repository.UserRepository;

/**
 * example service
 * @author Shihai.Fu
 *
 */
@Service
public class UserService {

	@Inject
	private UserRepository userRepository;
	
	public User getUser(int id){
		return userRepository.get(id);
	}
}
