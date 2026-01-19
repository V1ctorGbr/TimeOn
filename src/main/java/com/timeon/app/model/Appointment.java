package com.timeon.app.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clientName;
    private String service;
    private String date;
    private String time;
}
