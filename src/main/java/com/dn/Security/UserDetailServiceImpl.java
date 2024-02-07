package com.dn.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dn.Repo.UserRepo;
import com.dn.model.User;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
	
	@Autowired
	UserRepo ur;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user=ur.findByEmail(username);
		if(user==null)  throw new UsernameNotFoundException("Username not found "+username);
		
		return new  org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), user.getRoles());
	}

}
