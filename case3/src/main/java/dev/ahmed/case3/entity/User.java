package dev.ahmed.case3.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @Author  Ahmed Bughra
 * @Created 2/25/2022 - 3:28 PM
 * @Project case3-UyCoder
 */

@Entity
@Table(name = "USER")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(generator = "User")
    @SequenceGenerator(name = "User", sequenceName = "USER_ID_SEQ")
    @Column(name = "ID")
    private Long id;

    @Column(name = "USER_NAME", length = 15, nullable = false)
    private String name;

    @Column(name = "EMAIL", length = 15, nullable = false)
    private String email;

    @Column(name = "PHONE_NUMBER", length = 15, nullable = false)
    private Long phoneNumber;

    @Column(name = "USER_TYPE", length = 15)
    private String userType;

}
