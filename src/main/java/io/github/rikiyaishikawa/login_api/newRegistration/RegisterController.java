package io.github.rikiyaishikawa.login_api.newRegistration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    @PostMapping("/register")
    public RegisterResponse getRegisterPage() {
        Account ac = RegisterService.save();
        return new RegisterResponse(ac.getId(), ac.getEmail(), ac.getPassword());
    }


}
