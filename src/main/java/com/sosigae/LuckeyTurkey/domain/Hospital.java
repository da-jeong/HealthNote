package com.sosigae.LuckeyTurkey.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "HOSPITAL")
public class Hospital implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hospital_seq")
    @SequenceGenerator(name = "hospital_seq", sequenceName = "hospital_seq", allocationSize = 1)
    @Column(name = "HOSPITAL_ID")
    private int hospitalId;
    private String id;
    private String password;
    @Column(name = "NAME") 
    private String name;
    private String address;
    private String openTime;
    private String closeTime;
    private String satOpenTime;
    private String satCloseTime;
    private String email;
    private String phone;
//    @Column(name = "IS_ADMIN")
//    private int isAdmin;


    // 진료 과 추가
    private String department;
    
    //
    private int is_admin;


    

}
