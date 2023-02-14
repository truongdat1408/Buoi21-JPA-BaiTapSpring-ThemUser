package com.cybersoft.DemoJPA.service.Imp;

import com.cybersoft.DemoJPA.dto.UsersDTO;
import com.cybersoft.DemoJPA.entity.Users;

public interface UsersService {
    boolean addUsers(UsersDTO usersDTO);
    Users getUsersByEmailAndPassword(String email, String password);
}
