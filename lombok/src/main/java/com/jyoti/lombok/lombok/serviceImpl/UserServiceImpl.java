package com.jyoti.lombok.lombok.serviceImpl;

import com.jyoti.lombok.lombok.entities.UserEntity;
import com.jyoti.lombok.lombok.repository.UserRepository;
import com.jyoti.lombok.lombok.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserEntity addUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public UserEntity getUser(Long id) {
        return userRepository.findById(id).get();
    }
}
