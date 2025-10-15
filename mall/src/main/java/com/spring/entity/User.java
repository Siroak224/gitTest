package com.SpringBoot.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="username",nullable = false,length = 30)
	private String username;
	@Column(name="password",nullable = false,length = 100)
	private String password; 
	@Column(name="role",nullable = false,length = 15)
	private String role;
}
