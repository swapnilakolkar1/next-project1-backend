package com.app.webapp.controllers.services;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "APP_DATA")
public class AppEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "app_data_gen")
    @SequenceGenerator(name = "app_data_gen", sequenceName = "app_data_seq")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "user_name", nullable = false)
    private String name;



}
