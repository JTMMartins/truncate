package com.noshio.truncate;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;





    public User saveUser(User user){
        return userRepository.save(user);
    }
}

