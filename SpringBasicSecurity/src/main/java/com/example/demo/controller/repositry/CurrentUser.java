package com.example.demo.controller.repositry;


import org.springframework.security.core.authority.AuthorityUtils;


public class CurrentUser extends org.springframework.security.core.userdetails.User {

    public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	private Users user;

    public CurrentUser(Users user) {
        super(user.getUsername(), user.getPassword(), AuthorityUtils.createAuthorityList(user.getRole().toString()));
        this.user = user;
    }

    public String getName() {
        return user.getUsername();
    }

    public Role getRole() {
        return user.getRole();
    }

    @Override
    public String toString() {
        return "CurrentUser{" +
                "user=" + user +
                "} " + super.toString();
    }
}
