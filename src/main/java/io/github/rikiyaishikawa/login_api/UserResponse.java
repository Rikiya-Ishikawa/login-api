package io.github.rikiyaishikawa.login_api;

public class UserResponse {

    private String message;

    public UserResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
