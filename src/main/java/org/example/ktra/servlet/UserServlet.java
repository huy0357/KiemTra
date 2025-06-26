package org.example.ktra.servlet;

import org.example.ktra.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserServlet {
    @GetMapping("/api/users")
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Nguyen Van A", "a@example.com"));
        users.add(new User(2, "Tran Thi B", "b@example.com"));
        return users;
    }
}