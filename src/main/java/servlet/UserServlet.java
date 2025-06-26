package servlet;
import com.example.model.User;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/api/users")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Tạo dữ liệu mẫu
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Nguyen Van A", "a@example.com"));
        users.add(new User(2, "Tran Thi B", "b@example.com"));

        // Chuyển thành JSON
        Gson gson = new Gson();
        String json = gson.toJson(users);

        // Thiết lập response
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(json);
    }
}