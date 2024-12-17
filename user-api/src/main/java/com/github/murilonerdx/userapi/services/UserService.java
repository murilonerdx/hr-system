package com.github.murilonerdx.userapi.services;


import com.github.murilonerdx.userapi.domain.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll();
}
