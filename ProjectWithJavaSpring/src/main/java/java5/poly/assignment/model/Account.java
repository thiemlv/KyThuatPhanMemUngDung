package java5.poly.assignment.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Accounts")
public class Account {
    @Id
    @Column(name="username")
    @NotBlank
    private String userName;

    @Column(name = "passWord")
    @NotBlank
    private String pass;

    @Column(name = "fullname")
    @NotBlank
    private String fullName;

    @Column(name = "email")
    @NotBlank
    @Email()
    private String email;

    @Column(name = "photo")
    private String photo;

    @Column(name = "Active")
    private Boolean activated;

    @Column(name = "admin")
    private Boolean ADM;

 }
