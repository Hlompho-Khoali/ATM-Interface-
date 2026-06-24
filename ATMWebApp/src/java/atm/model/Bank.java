/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hlomp
 */
public class Bank {
    private Map<String, User> users;

    public Bank() {
        users = new HashMap<>();
        // Sample users
        users.put("1234", new User("1234", "1111", 5000));
        users.put("5678", new User("5678", "2222", 3000));
    }

    public User authenticate(String userId, String pin) {
        User user = users.get(userId);
        if (user != null && user.getPin().equals(pin)) {
            return user;
        }
        return null;
    }

    public User getUser(String userId) {
        return users.get(userId);
    }
}
