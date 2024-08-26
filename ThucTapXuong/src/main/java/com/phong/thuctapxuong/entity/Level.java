package com.phong.thuctapxuong.entity;





import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "levels")
public class Level implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "level_id")
    private Integer id;

    @Column(name = "level_name")
    private String levelName;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;
}
