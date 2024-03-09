package com.example.club.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "anager_dtls")

public class ManagerDetails {

    //firstName
    //LastName
    //Age
    //mobNo
    //email
    //ClubName
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int manager_id;
    @Column(name= "first_name")
    String manager_first_name;

    @Column(name = "last_Name")
    String manager_last_name;
    @Column(name= "age")
    String manager_age;

    @Column(name = "mobno")
    Integer manager_mobno;

    @Column(name = "email")
    String manager_email;
    @Column(name = "club_name")
    String manager_club;


}
