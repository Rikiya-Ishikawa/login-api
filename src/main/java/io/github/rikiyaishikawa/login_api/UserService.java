package io.github.rikiyaishikawa.login_api;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserMapper userMapper;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserService(UserMapper userMapper, BCryptPasswordEncoder passwordEncoder) {
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
    }

    public User insert(UserRequest userRequest) {
        String hashedPassword = passwordEncoder.encode(userRequest.getPassword());
        String userRole = "USER";
        User user = new User(
            userRequest.getUsername(),
            hashedPassword,
            userRequest.getEmail(),
            userRole
        );

        userMapper.insert(user);
        return user;
    }

}
