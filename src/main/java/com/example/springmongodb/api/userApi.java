package com.example.springmongodb.api;


import com.example.springmongodb.entity.user;
import com.example.springmongodb.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/user")
public class userApi {

    @Autowired
    private userRepository uRepository;

    @PostConstruct
    public void init(){
        user userr= new user();
        userr.setName("adem");
        userr.setSurname("kaya");
        uRepository.save(userr);
    }
    @PostMapping
    public ResponseEntity<user> insert(user userr){
        return ResponseEntity.ok(uRepository.save(userr));
    }
    @GetMapping
    public ResponseEntity<List<user>> listAll(){
        return ResponseEntity.ok(uRepository.findAll());
    }

}
