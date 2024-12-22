package com.fastturtle.oauthserver.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class AppUser extends BaseModel {

    private String fname;

    private String lname;

    private String username;

    private String password;

    private String email;

    private String role;
}
