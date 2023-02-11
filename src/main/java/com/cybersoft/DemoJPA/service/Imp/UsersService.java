package com.cybersoft.DemoJPA.service.Imp;

import com.cybersoft.DemoJPA.entity.Users;
import com.cybersoft.DemoJPA.payload.UsersRequest;
import com.cybersoft.DemoJPA.payload.UsersResponse;

public interface UsersService {
    UsersResponse addUsers(UsersRequest usersRequest);
    Users getUsersByEmailAndPassword(String email, String password);
}
