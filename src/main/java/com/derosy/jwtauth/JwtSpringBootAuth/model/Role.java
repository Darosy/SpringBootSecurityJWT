package com.derosy.jwtauth.JwtSpringBootAuth.model;

import com.derosy.jwtauth.JwtSpringBootAuth.utils.Constans;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Entity
@Table(name = "tbl_roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private Constans.RoleName name;

    public Role() {
    }

    public Role(Constans.RoleName name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Constans.RoleName getName() {
        return name;
    }

    public void setName(Constans.RoleName name) {
        this.name = name;
    }
}
