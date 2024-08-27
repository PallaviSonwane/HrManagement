package inc.hrmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/api")
public class ProtectedController {

    @GetMapping("/protected")
    public String protectedResource(HttpSession session) {
        String username = (String) session.getAttribute("username");
        if (username == null) {
            return "Access denied. Please login.";
        }
        return "Welcome, " + username + ". You have access to this resource.";
    }
}
