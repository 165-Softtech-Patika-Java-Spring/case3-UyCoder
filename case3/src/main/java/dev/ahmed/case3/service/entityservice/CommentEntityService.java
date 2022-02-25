package dev.ahmed.case3.service.entityservice;

import dev.ahmed.case3.dao.CommentDao;
import dev.ahmed.case3.dao.UserDao;
import dev.ahmed.case3.entity.Comment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;

/**
 * @Author Ahmed Bughra
 * @Created 2/25/2022 - 4:52 PM
 * @Project case3-UyCoder
 */

@Service
@RequiredArgsConstructor
public class CommentEntityService {


    private final CommentDao commentDao;
    private final UserDao userDao;

    public List<Comment> findAll() {
        return commentDao.findAll();
    }

    public Comment saveComment(Comment comment) {
        return commentDao.save(comment);
    }

    public List<Comment> findAllByUserId(Long userId) {
        List<Comment> commentList = commentDao.findAllByIdUser(userId);
        if (commentList != null){
            return commentDao.findAllByIdUser(userId);
        } else {
            String errorCode = userDao.findUserById(userId).getName() + "adindaki kullanıcı henüz bir yorum yazmamıştır";
            throw new NotFoundException(errorCode);
        }
    }

    public void deleteComment(Long id) {
        commentDao.deleteById(id);
    }
}
