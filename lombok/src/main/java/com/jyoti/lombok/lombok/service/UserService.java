package com.jyoti.lombok.lombok.service;

import com.jyoti.lombok.lombok.entities.UserEntity;

public interface UserService {

    UserEntity addUser(UserEntity userEntity);

    UserEntity getUser(Long id);


}
