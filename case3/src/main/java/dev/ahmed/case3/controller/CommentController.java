package dev.ahmed.case3.controller;

import dev.ahmed.case3.entity.Comment;
import dev.ahmed.case3.entity.Product;
import dev.ahmed.case3.service.entityservice.CommentEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Ahmed Bughra
 * @Created 2/25/2022 - 5:24 PM
 * @Project case3-UyCoder
 */

@Controller
@RequestMapping("/api/v1/comments")
@RequiredArgsConstructor
public class CommentController {

    public final CommentEntityService commentEntityService;

    // Bir kullanıcının yaptığı yorumlari getiren bir servis yazınız.
        // Eğer ilgili kullanıcının henüz bir yorumu yoksa
        // “XXX kullanıcı henüz bir yorum yazmamıştır” şeklinde bir hata vermeli.
    @GetMapping("/{userId}")
    public ResponseEntity findAllByUserId(@PathVariable Long userId) {
        List<Comment> comments = commentEntityService.findAllByUserId(userId);
        return ResponseEntity.ok(comments);
    }


    //Bir ürüne yapılan tüm yorumları getiren bir servis yazınız.
        // Eğer o ürüne henüz bir yorum yazılmamışsa
        // “XXX ürüne henüz bir yorum yazılmamıştır” şeklinde bir hata vermeli.


    //Yeni bir yorum yazılabilecek bir servis yazınız.
    @PostMapping
    public ResponseEntity saveComment(@RequestBody Comment comment) {
        comment = commentEntityService.saveComment(comment);
        return ResponseEntity.ok(comment);
    }

    //Yorum silebilecek bir servis yazınız.
    @DeleteMapping("/{id}")
    public ResponseEntity deleteComment(@PathVariable Long id) {
        commentEntityService.deleteComment(id);
        return ResponseEntity.ok(Void.TYPE);
    }

}
