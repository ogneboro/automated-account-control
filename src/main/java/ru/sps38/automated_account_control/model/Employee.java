package ru.sps38.automated_account_control.model;

import lombok.*;

import javax.persistence.*;

@Data
@EqualsAndHashCode
@Entity
@Table
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @ManyToOne
    private Post post;
    private String location;
    private String email;
    private String portal;
    private String phone;

    @OneToOne
    @JoinColumn
    private OneC oneC;

}
