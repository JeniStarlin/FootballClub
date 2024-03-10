package com.example.club.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "club_info")

public class club_dtls {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
            @JsonProperty("clubId")
    int club_id;
   @Column(name= "club_code")
   @JsonProperty("clubCode")
    String club_code;
   @Column(name= "club_name")
   @JsonProperty("clubName")
   String club_name;
   @Column(name= "club_country")
   @JsonProperty("clubCtry")
   String club_country;
   @Column(name = "club_league")
   @JsonProperty("clubLeague")
   String club_league;
}
