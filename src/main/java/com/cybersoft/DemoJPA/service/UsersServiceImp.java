package com.cybersoft.DemoJPA.service;

import com.cybersoft.DemoJPA.dto.UsersDTO;
import com.cybersoft.DemoJPA.entity.Roles;
import com.cybersoft.DemoJPA.entity.Users;
import com.cybersoft.DemoJPA.payload.UsersRequest;
import com.cybersoft.DemoJPA.payload.UsersResponse;
import com.cybersoft.DemoJPA.repository.RolesRepository;
import com.cybersoft.DemoJPA.repository.UsersRepository;
import com.cybersoft.DemoJPA.service.Imp.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImp implements UsersService {
    @Autowired
    UsersRepository usersRepository;

    @Autowired
    RolesRepository rolesRepository;

    @Override
    public UsersResponse addUsers(UsersRequest usersRequest) {
        Users users = new Users();
//        users.setId(usersRequest.getId());
        users.setAvatar(usersRequest.getAvatar());
        users.setEmail(usersRequest.getEmail());
        users.setFullname(usersRequest.getFullname());
        users.setPassword(usersRequest.getPassword());

        Roles role = rolesRepository.findByName("ROLE_USER");
        users.setRoles(role);
        Users savedUser = usersRepository.save(users);

        UsersResponse usersResponse = new UsersResponse(
                savedUser.getId(),
                savedUser.getEmail(),
                savedUser.getFullname(),
                savedUser.getAvatar(),
                savedUser.getRoles().getId());

        return usersResponse;
    }

    @Override
    public Users getUsersByEmailAndPassword(String email, String password) {
        return usersRepository.findUsersByEmailAndPassword(email, password);
    }
}
