package com.NotificationPreferencesService.entites;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter @Getter
public class Notification {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String customer;

    private Boolean smsPreferenceFlag ;
    private Boolean emailPreferenceFlag ;
    private String phoneNumber ;
    private String emailAddress ;


}
