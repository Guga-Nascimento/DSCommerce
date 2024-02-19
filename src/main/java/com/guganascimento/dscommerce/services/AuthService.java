package com.guganascimento.dscommerce.services;


import com.guganascimento.dscommerce.entities.User;
import com.guganascimento.dscommerce.services.exceptions.ForbiddenException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserService userService;
    public void validateSelfOrAdmin(long userId){
        User me = userService.authenticated();
        if(!me.hassRole("ROLE_ADMIN") && !me.getId().equals(userId)){
            throw new ForbiddenException("ACESS DENID");
        }

    }

}
