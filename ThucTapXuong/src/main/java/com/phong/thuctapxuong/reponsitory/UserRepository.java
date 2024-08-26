package com.phong.thuctapxuong.reponsitory;



import com.phong.thuctapxuong.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
