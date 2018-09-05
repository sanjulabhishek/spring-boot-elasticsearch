package com.example.demo.load;

import com.example.demo.model.Users;
import com.example.demo.repository.UsrerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Loaders {

    @Autowired
    ElasticsearchOperations elasticsearchOperations;

    @Autowired
    UsrerRepository usrerRepository;

    @PostConstruct
    public void loadAll(){
        elasticsearchOperations.putMapping(Users.class);
        System.out.println("Loading data");
        usrerRepository.save(getData());
        System.out.println("Loaded data");

    }

    public Users getData(){
        return new Users("a", 2000, 2l);

    }

}
