package com.klef.jfsd.exam.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    // Getters and Setters
}
