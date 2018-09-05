package com.example.demo.resource;

import com.example.demo.model.Users;
import com.example.demo.repository.UsrerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/rest/search")
public class SearchResource {

    @Autowired
    UsrerRepository usrerRepository;

    @GetMapping("/{id}")
    public ResponseEntity<?> getBookById(@PathVariable String id){
        Users users = usrerRepository.save(new Users("b",1200, 4l));
        return new ResponseEntity<Users>(users, HttpStatus.OK);
    }

}
