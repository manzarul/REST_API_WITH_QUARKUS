package org.demo.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;


@Entity(name = "users")
public class User extends PanacheEntity {

    public String name;

    public String email;

}
