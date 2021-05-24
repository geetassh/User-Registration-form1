package com.app1.restapp;



import javax.persistence.*;

@Entity
@Table(name = "userss")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false,unique = true,length = 45)
    private String email;
    @Column(nullable = false,length = 64)
    private String password;
    @Column(nullable = false,length = 20)

    private String firstname;
    @Column(nullable = false,length = 20)

    private String lastname;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
