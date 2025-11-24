package io.github.rikiyaishikawa.login_api;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserMapper userMapper;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
    }

    public User insert(UserRequest userRequest) {
        String hashedPassword = passwordEncoder.encode(userRequest.getPassword());
        User user = new User(
            userRequest.getUsername(),
            hashedPassword,
            userRequest.getEmail(),
            userRequest.getRole()
        );

        User result = userMapper.insert(user);
        return result;
    }

}
