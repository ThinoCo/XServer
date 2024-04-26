package cn.thino.XServer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/login")
    public ResponseEntity<String> handleLogin(@RequestParam String username, @RequestParam String password) {
        if ("Admin".equals(username) && "123".equals(password)) {
            return new ResponseEntity<>("Login successful!", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Login failed! Incorrect username or password!", HttpStatus.UNAUTHORIZED);
        }
    }
}