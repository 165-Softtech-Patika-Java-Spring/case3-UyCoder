package dev.ahmed.case3.dao;

import dev.ahmed.case3.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Ahmed Bughra
 * @Created 2/25/2022 - 4:32 PM
 * @Project case3-UyCoder
 */

@Repository
public interface CommentDao extends JpaRepository<Comment, Long> {
    List<Comment> findAllByIdUser(Long idUser);
    List<Comment> findAllByIdProduct(Long idProduct);

}
