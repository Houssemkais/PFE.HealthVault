package com.pfe.entities;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
@Data
public class PasswordForgotDto {
    @Email
    @NotEmpty
    private String email;

}
