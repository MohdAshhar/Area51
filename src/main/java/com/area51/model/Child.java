package com.area51.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "CHILD")
public class Child implements Cloneable,Serializable {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "CHILD_ID")
    private String id;

    @NotNull
    @Column(name = "CHILD_NAME")
    private String name;

    @NotNull
    @Column(name = "GENDER")
    private String gender;

    @NotNull
    @Column(name = "AGE")
    private int age;

    @ManyToOne
    private Users user;


}
