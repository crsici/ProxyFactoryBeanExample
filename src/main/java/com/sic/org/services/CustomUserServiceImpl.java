package com.sic.org.services;

/**
 * Created by pthanhtrung on 3/28/2016.
 */
public class CustomUserServiceImpl implements CustomUserService {
    @Override
    public void hello() {
        System.out.println("Hello");
    }

    @Override
    public void goodbye() {
        System.out.println("Goodbye");
    }
}
