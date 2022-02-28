package dev.ahmed.case3.controller;



import dev.ahmed.case3.entity.User;
import dev.ahmed.case3.service.entityservice.UserEntityService;
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
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    public final UserEntityService userEntityService;


    //Tüm kullanıcıları getiren bir servis yazınız.
    @GetMapping
    public ResponseEntity findAllUser() {
        List<User> users = userEntityService.findAllUser();
        return ResponseEntity.ok(users);
    }

    //Kullanıcı id'sinden kullanıcıyı getiren bir servis yazınız.
    @GetMapping("/{id}")
    public ResponseEntity findAllUserById(@PathVariable Long id) {
        User user = userEntityService.findAllUserById(id);
        return ResponseEntity.ok(user);
    }

    //Kullanıcı adından kullanıcıyı getiren bir servis yazınız.
    @GetMapping("/{name}")
    public ResponseEntity findAllUserByName(@PathVariable String name) {
        User user = userEntityService.findAllUserByName(name);
        return ResponseEntity.ok(user);
    }

    //Kullanıcı kaydedilebilecek bir servis yazınız.
    @PostMapping
    public ResponseEntity saveUser(@RequestBody User user){
        user = userEntityService.saveUser(user);
        return ResponseEntity.ok(user);
    }

    // Kullanıcı silebilecek bir servis yazınız.(kullanıcı adı, ve telefon bilgileri alınmalı).
            // Eğer kullanıcı adı ve telefon uyuşmuyorsa
             // “XXX kullanıcı adı ile YYY telefonu bilgileri uyuşmamaktadır.” şeklinde bir uyarı vermeil.
    @DeleteMapping
    public ResponseEntity deleteUser(Long id){
        userEntityService.deleteUserById(id);
        return ResponseEntity.ok(Void.TYPE);
    }


    //==================== Bitmedi!!!!!!!!!!!!!!!!!
    //Kullanıcı bilgilerini güncelleyebilecek bir servis yazınız.
    @PatchMapping("/{id}")
    public ResponseEntity updateUser(@PathVariable Long id, User user) {
         userEntityService.updateUser(id);
        return ResponseEntity.ok(user);
    }

}
