package io.github.rikiyaishikawa.login_api.user.domain;

public class Account {
    private Long id;                 // DBの主キー
    private String email;         // ログインID（メールでもOK）
    private String password;         // ハッシュ済みパスワード
    private String displayName;      // 表示名（任意）

    public Account(Long id, String email, String password, String displayName) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.displayName = displayName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
