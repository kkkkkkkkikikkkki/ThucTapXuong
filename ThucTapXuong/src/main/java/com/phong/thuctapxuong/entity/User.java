package com.phong.thuctapxuong.entity;



import java.io.Serializable;
import java.util.List;


import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "users_id")
    private Integer id;

    @Column(name = "wallet_address")
    private String walletAddress;

    @OneToMany(mappedBy = "user")
    private List<Level> levels;

    @OneToMany(mappedBy = "user")
    private List<UserAnswer> userAnswers;

    @OneToMany(mappedBy = "user")
    private List<Reward> rewards;
}
