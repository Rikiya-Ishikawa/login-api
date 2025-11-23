package io.github.rikiyaishikawa.login_api;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User insert(UserRequest userRequest) {
        User result = userMapper.insert(userRequest);
        return result;
    }

}
