package edu.ua.user.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.ua.user.model.AppUser;
import edu.ua.user.repository.AppUserRepository;
import edu.ua.user.service.AppUserService;

@RestController
@RequestMapping("/api/v1/user")
public class AppUserController {

    @Autowired
    private AppUserService appUserRepository;

    @GetMapping
    public List<AppUser> getAppUsers(){
        return appUserRepository.findAll();
    }
    @PostMapping("/user")
    public AppUser createUser(@RequestBody AppUser user){

    }
    
    @GetMapping("/user/email")
    public AppUser getUserByEmail(@RequestParam String ){
        AppUser userByEmail 
            = AppUserService.getUserByEmail(email);
        if (userByEmail != null){
            return ResponseEntity.ok(userByEmail);
        }
        return ResponseEntity.notFound().build();
    }
    
}
