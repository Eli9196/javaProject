package com.tbp.crud;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.tbp.crud.entity.AccountProfile;

public class AccountProfileTest {

    @Test
    public void testAccountProfileInitialization() {
        AccountProfile accountProf = new AccountProfile("name", "surname", "http://example.com/image.jpg");
        assertEquals("name", accountProf.getName());
        assertEquals("surname", accountProf.getSurname());
        assertEquals("http://example.com/image.jpg", accountProf.getHttpImageLink());
    }
}
