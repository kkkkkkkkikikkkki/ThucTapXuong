package com.phong.thuctapxuong.reponsitory;



import com.phong.thuctapxuong.entity.UserAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserAnswerRepository extends JpaRepository<UserAnswer, Integer> {

}
