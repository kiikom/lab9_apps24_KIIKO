package edu.ua.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.ua.user.model.AppUser;

public interface AppUserRepository extends JpaRepository <AppUser, Integer>{
    @Query("SELECT u FROM app_user u WHERE u.email = ?1")
    AppUser  findUserByEmail(String email);

    AppUser findBYEmail(String email);
}
