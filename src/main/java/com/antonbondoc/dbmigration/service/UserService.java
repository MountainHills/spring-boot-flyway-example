package com.antonbondoc.dbmigration.service;

import com.antonbondoc.dbmigration.model.User;
import com.antonbondoc.dbmigration.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getUserList() {
        return userRepository.findAll();
    }
}
