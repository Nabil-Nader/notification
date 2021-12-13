package com.NotificationPreferencesService.controller;

import com.NotificationPreferencesService.model.NotificationPojo;
import com.NotificationPreferencesService.services.NotificationServices;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notification/preferences")
public class NotificationAPI {

    private final NotificationServices notificationServices ;

    public NotificationAPI(NotificationServices notificationServices) {
        this.notificationServices = notificationServices;
    }

    @GetMapping("/find/{id}")
    public NotificationPojo getNotification(@PathVariable("id") String id){

        return notificationServices.findNotification(id);

    }





}
