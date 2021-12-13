package com.NotificationPreferencesService.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class NotificationPojo {

    private String status ;
    private String statusDescription ;


    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String customerId;

    private Boolean smsPreferenceFlag ;
    private Boolean emailPreferenceFlag ;
    private String phoneNumber ;
    private String emailAddress ;



}
