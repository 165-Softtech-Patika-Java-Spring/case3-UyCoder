package dev.ahmed.case3.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @Author  Ahmed Bughra
 * @Created 2/25/2022 - 3:29 PM
 * @Project case3-UyCoder
 */

@Entity
@Table(name = "COMMENT")
@Getter
@Setter
public class Comment {

    @Id
    @GeneratedValue(generator = "Comment")
    @SequenceGenerator(name = "Comment", sequenceName = "COMMENT_ID_SEQ")
    @Column(name = "ID")
    private Long id;

    @Column(name = "TEXT", nullable = false)
    private String text;

    @Column(name = "ID_USER", length = 10, nullable = false)
    private Long idUser;

    @Column(name = "ID_PRODUCT", length = 5, nullable = false)
    private Long idProduct;

}
