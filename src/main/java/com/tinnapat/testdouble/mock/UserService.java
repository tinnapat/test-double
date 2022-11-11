package com.tinnapat.testdouble.mock;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        List<User> userList = new ArrayList<>();

        List<String> userIds = userRepository.findAllUserIds();
        for (String userId : userIds) {
            userList.add(userRepository.findById(userId));
        }

        return userList;
    }
}
