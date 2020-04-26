package com.pfa.amicali.Entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
public class Community implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String communityName;
    private String communityEmail;
    @ManyToOne
    private Subscriber communityManger;
    @ManyToMany()
    private List<Subscriber> communityMember;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getCommunityEmail() {
        return communityEmail;
    }

    public void setCommunityEmail(String communityEmail) {
        this.communityEmail = communityEmail;
    }

    public Subscriber getCommunityManger() {
        return communityManger;
    }

    public void setCommunityManger(Subscriber communityManger) {
        this.communityManger = communityManger;
    }

    public List<Subscriber> getCommunityMember() {
        return communityMember;
    }

    public void setCommunityMember(List<Subscriber> communityMember) {
        this.communityMember = communityMember;
    }
}
