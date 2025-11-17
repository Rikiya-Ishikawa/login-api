package io.github.rikiyaishikawa.login_api.newRegistration;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterService {
    private RegisterMapper registerMapper;
    private BCryptPasswordEncoder passwordEncoder;

    public RegisterService(RegisterMapper registerMapper, BCryptPasswordEncoder passwordEncoder) {
        this.registerMapper = registerMapper;
        this.passwordEncoder = passwordEncoder;
    }

    public List<Account> createUser() {
        // パスワードを暗号化
        String encodedPassword = passwordEncoder.encode(rawPassword);
        // データベースに保存
        Account account = new Account();
        account.setEmail(email);
        account.setPassword(encodedPassword); // 暗号化済みパスワードを保存
        account.setDisplayName(displayname);
        userMapper.insertUser(account);
    }
}
