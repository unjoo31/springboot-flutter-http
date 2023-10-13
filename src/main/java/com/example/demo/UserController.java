package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {
    @GetMapping("/user")
    public ResponseEntity<?> userList() {
        System.out.println("/user 요청됨");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "ssar", "1234", "ssar@nate.com"));
        userList.add(new User(2, "cos", "1234", "cos@nate.com"));
        userList.add(new User(3, "love", "1234", "love@nate.com"));
        return ResponseEntity.ok().body(userList);
    }
    @GetMapping("/user/1")
    public ResponseEntity<?> user() {
        System.out.println("/user/1 요청됨");
        return ResponseEntity.ok().body(new User(1, "ssar", "1234", "ssar@nate.com"));
    }
}
