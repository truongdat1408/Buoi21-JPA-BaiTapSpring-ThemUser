package com.cybersoft.DemoJPA.repository;

import com.cybersoft.DemoJPA.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
    Users findUsersByEmailAndPassword(String email, String password);
}
