package com.phong.thuctapxuong.reponsitory;



import com.phong.thuctapxuong.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
