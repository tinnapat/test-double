package com.tinnapat.testdouble.mock;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;

class UserServiceTest {

    @Test
    void getAllUsers() {
        // set up
        UserRepository mockUserRepository = mock(UserRepository.class);
        UserService userService = new UserService(mockUserRepository);

        // given
        given(mockUserRepository.findAllUserIds())
                .willReturn(Arrays.asList("user01", "user02"));
        given(mockUserRepository.findById("user01"))
                .willReturn(new User("user01", "scott"));
        given(mockUserRepository.findById("user02"))
                .willReturn(new User("user02", "tiger"));

        // when
        List<User> userList = userService.getAllUsers();

        // then
        InOrder inOrder = inOrder(mockUserRepository);
        then(mockUserRepository).should(inOrder).findAllUserIds();
        then(mockUserRepository).should(inOrder).findById("user01");
        then(mockUserRepository).should(inOrder).findById("user02");
        then(mockUserRepository).shouldHaveNoMoreInteractions();

        assertEquals(2, userList.size());
        assertEquals("scott", userList.get(0).getUserName());
        assertEquals("tiger", userList.get(1).getUserName());
    }
}