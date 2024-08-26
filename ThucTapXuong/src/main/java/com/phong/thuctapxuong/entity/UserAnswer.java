package com.phong.thuctapxuong.entity;




import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_answers")
public class UserAnswer implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    @ManyToOne
    @JoinColumn(name = "answer_id")
    private Answer answer;
}
