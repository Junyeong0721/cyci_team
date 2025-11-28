package kr.soft.git;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @GetMapping("/d")
    public void getD() {
        System.out.println("dddddd");
    }

}
