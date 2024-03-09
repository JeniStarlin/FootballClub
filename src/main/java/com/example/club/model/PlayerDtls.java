package com.example.club.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "player_dtls")
public class PlayerDtls {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int player_id;
    @Column(name= "player_code")
    String player_first_name;
    @Column(name= "player_name")
    String player_last_name;
    @Column(name= "player_country")
    String player_country;
    @Column(name = "player_league")
    String player_league;
    @Column(name = "player_club")
    String player_club;
    @Column(name = "player_position")
    String player_position;
}
