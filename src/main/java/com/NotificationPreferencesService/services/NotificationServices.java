package com.NotificationPreferencesService.services;

import com.NotificationPreferencesService.entites.Notification;
import com.NotificationPreferencesService.model.NotificationPojo;
import com.NotificationPreferencesService.repositories.NotificationRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServices {

    private final NotificationRepo notificationRepo ;

    public NotificationServices(NotificationRepo notificationRepo) {
        this.notificationRepo = notificationRepo;
    }

    public List<Notification> findAll(){
        return notificationRepo.findAll();
    }

    public NotificationPojo findNotification(String id){
        NotificationPojo notificationPojo   = new NotificationPojo();

       Notification notification =notificationRepo.findByCustomer(id);
       if(notification == null){
           throw new RuntimeException();
       } else{

           notificationPojo.setStatus("SUCCESS");
           notificationPojo.setStatusDescription("Notification Received Successfully");
           notificationPojo.setEmailAddress(notification.getEmailAddress());

           notificationPojo.setPhoneNumber(notification.getPhoneNumber());

           notificationPojo.setEmailPreferenceFlag(notification.getEmailPreferenceFlag());
           notificationPojo.setSmsPreferenceFlag(notification.getSmsPreferenceFlag());
           return notificationPojo;

       }


    }

    public void saveNotification(NotificationPojo notificationPojo){
        Notification notification = new Notification();

        notification.setEmailPreferenceFlag(notificationPojo.getEmailPreferenceFlag());
        notification.setSmsPreferenceFlag(notificationPojo.getSmsPreferenceFlag());
        notification.setCustomer(notificationPojo.getCustomerId());
        notification.setPhoneNumber(notificationPojo.getPhoneNumber());
        notification.setEmailAddress(notificationPojo.getEmailAddress());

        notificationRepo.save(notification);

    }

    public NotificationPojo getDate(Long id){

        NotificationPojo notificationPojo   = new NotificationPojo();

        Notification notification =notificationRepo.findNotificationById(id);
        System.out.println(notification.getEmailAddress());

        notificationPojo.setStatus("SUCCESS");
        notificationPojo.setStatusDescription("Notification Received Successfully");
        notificationPojo.setEmailAddress(notification.getEmailAddress());
        notificationPojo.setPhoneNumber(notificationPojo.getPhoneNumber());
        notificationPojo.setEmailPreferenceFlag(notification.getEmailPreferenceFlag());
        notificationPojo.setSmsPreferenceFlag(notification.getSmsPreferenceFlag());
        return notificationPojo;


    }




}
