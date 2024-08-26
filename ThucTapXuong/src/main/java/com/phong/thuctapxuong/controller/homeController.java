package com.phong.thuctapxuong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  // Sử dụng @RestController nếu bạn muốn trả về JSON thay vì view.
@RequestMapping("/home")
public class homeController {

    @GetMapping("/index")
    public String index() {
        return "Home";  // Đảm bảo rằng view 'Home' tồn tại và được cấu hình trong view resolver.
    }
}
