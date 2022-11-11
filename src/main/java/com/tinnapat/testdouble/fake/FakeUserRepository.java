package com.tinnapat.testdouble.fake;

import java.util.ArrayList;

public class FakeUserRepository implements UserRepository {

    @Override
    public User getUserById(String userId) {
        return new User(userId, "user1@mycompany.com", new ArrayList<>());
    }
}
