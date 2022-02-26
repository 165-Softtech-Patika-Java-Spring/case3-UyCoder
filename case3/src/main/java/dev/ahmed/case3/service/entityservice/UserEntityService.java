package dev.ahmed.case3.service.entityservice;

import dev.ahmed.case3.dao.UserDao;
import dev.ahmed.case3.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Ahmed Bughra
 * @Created 2/25/2022 - 4:41 PM
 * @Project case3-UyCoder
 */

@Service
@RequiredArgsConstructor
public class UserEntityService {


    private final UserDao userDao;

    public List<User> findAllUser() {
        return userDao.findAll();
    }

    public User saveUser(User user) {
        return userDao.save(user);
    }

    public User findAllUserById(Long id) {
        return userDao.getById(id);
    }

    public User findAllUserByName(String name) {
        return userDao.findUserByName(name);
    }

    public void deleteUserById(Long id) {
            userDao.deleteById(id);
    }

    public User updateUser(Long id){
        User user = userDao.getById(id);
        return user;
    }
}
