package com.NotificationPreferencesService.repositories;

import com.NotificationPreferencesService.entites.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepo extends JpaRepository<Notification,Long> {


    Notification findByCustomer(String customer);

    Notification findNotificationById(Long id);



}
