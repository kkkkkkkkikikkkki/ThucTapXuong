package com.phong.thuctapxuong.entity;



import java.io.Serializable;
import java.util.List;


import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "questions")
public class Question implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private Integer id;

    @Column(name = "question_text")
    private String questionText;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers;

    @OneToMany(mappedBy = "question")
    private List<CorrectAnswer> correctAnswers;

    @OneToMany(mappedBy = "question")
    private List<UserAnswer> userAnswers;

    @OneToMany(mappedBy = "question")
    private List<Reward> rewards;
}
