package com.springmvcone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginDAO logindao;
	public boolean check(String login, String password)
	{
		return logindao.check(login, password);
	}
}
