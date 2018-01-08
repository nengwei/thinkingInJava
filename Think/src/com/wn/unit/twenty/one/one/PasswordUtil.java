package com.wn.unit.twenty.one.one;

import java.util.List;

/**
 * Created by nengwei on 2018/1/7.
 */
public class PasswordUtil {

    @UseCase(id = 47, description = "passwords must conrain at least one numeric")
    public boolean validatePassword(String password) {
        return (password.matches("\\w*\\d\\w*"));
    }

    @UseCase(id = 48)
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id = 49, description = "new passwords cant't equal previously used ones")
    public boolean checkForNewPassword(List<String> prevPasswords, String password) {
        return !prevPasswords.contains(password);
    }
}
