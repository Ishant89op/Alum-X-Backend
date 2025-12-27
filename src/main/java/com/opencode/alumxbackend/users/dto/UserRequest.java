package com.opencode.alumxbackend.users.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
@Getter@Setter
public class UserRequest {
    @NotBlank(message = "Username is required")
    @Size(max = 12, message = "Username must be 12 characters or less")
    private String username;

    @NotBlank(message = "Full name is required")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Password is required")
    private String password;

    @NotBlank(message = "Role is required (STUDENT/ALUMNI/PROFESSOR)")
    private String role;

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
