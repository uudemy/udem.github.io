package com.universal_yazilim.bid.ysm.gateway_app.controller;

import com.universal_yazilim.bid.ysm.gateway_app.model.service.AbstractUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/authentication")
@RestController
public class AuthenticationController
{
    @Autowired
    AbstractUserService userService;

    //sign-in (kullanıcı oturum açma)

    //sign-up (kullanıcı kaydı)
}
