package com.github.murilonerdx.userapi.repositories;

import com.github.murilonerdx.userapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
