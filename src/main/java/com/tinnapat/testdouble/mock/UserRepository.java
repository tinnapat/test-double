package com.tinnapat.testdouble.mock;

import java.util.List;

public interface UserRepository {

    public List<String> findAllUserIds();

    public User findById(String userId);
}
