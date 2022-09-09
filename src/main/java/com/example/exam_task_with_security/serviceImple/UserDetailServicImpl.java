package com.example.exam_task_with_security.serviceImple;

import com.example.exam_task_with_security.model.modelUsers.SecurityUser;
import com.example.exam_task_with_security.model.modelUsers.User;
import com.example.exam_task_with_security.repositoryImpl.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailServicImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;





    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.getUserByUsername(username);
        if (user==null){
            throw new UsernameNotFoundException("could not found user");
        }
        return new SecurityUser(user);
    }
}
