package com.test.entretien.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "todo")
@Getter
@Setter
public class Todo {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;
}
