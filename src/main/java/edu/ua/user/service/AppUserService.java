package edu.ua.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ua.user.repository.AppUserRepository;

@Service
public class AppUserService {
    private AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository){
        this.appUserRepository = appUserRepository;
    }
    public List<AppUser> getAppUsers(){
        return appUserRepository.findAll();
    }
    public AppUser createUser (AppUser user){
        return appUserRepository.save(user);
    }
    public AppUser getUserByEmail (String email){
        return appUserRepository.findByEmail(email);
    }
}
