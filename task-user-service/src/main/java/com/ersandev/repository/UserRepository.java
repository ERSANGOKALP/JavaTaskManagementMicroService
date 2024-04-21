package com.ersandev.repository;

import com.ersandev.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String email);
}
