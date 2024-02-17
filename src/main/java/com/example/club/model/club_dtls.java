package com.example.club.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "club_dtls")

public class club_dtls {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int club_id;
   @Column(name= "club_code")
    String club_code;
   @Column(name= "club_name")
   String club_name;
   @Column(name= "club_country")
   String club_country;
   @Column(name = "club_league")
   String club_league;
}
