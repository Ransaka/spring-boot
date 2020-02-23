package io.simpleapp.com.services.implimentation;

import io.simpleapp.com.services.UserServices;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServices {
    @Override
    public String findAllusers() {
//        database search
//        return all users
        return "All users";
    }
}
