package dev.ahmed.case3.dao;

import dev.ahmed.case3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * @Author Ahmed Bughra
 * @Created 2/25/2022 - 4:05 PM
 * @Project case3-UyCoder
 */

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    User findUserByName(String name);
    User findUserById(Long id);

}
