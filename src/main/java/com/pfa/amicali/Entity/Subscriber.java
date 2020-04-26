package com.pfa.amicali.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
public class Subscriber implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    @OneToMany(mappedBy = "communityManger")
    private List<Community> communityToManage;
    @ManyToMany(mappedBy = "communityMember")
    private List<Community> communityIn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @JsonIgnore
    public List<Community> getCommunityToManage() {
        return communityToManage;
    }

    public void setCommunityToManage(List<Community> communityToManage) {
        this.communityToManage = communityToManage;
    }
    @JsonIgnore
    public List<Community> getCommunityIn() {
        return communityIn;
    }

    public void setCommunityIn(List<Community> communityIn) {
        this.communityIn = communityIn;
    }
}
