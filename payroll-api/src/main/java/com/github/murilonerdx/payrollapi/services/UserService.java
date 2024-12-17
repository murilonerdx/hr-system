package com.github.murilonerdx.payrollapi.services;


import com.github.murilonerdx.payrollapi.domain.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll();
}
