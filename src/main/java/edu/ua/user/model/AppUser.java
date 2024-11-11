package edu.ua.user.model;
import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity(name = "app_user")
@Table
@Data
public class AppUser {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(unique=true)
    private String email;

    @Column(unique=true)
    private LocalDate dob;

    @Transient
    private Integer age;
}
