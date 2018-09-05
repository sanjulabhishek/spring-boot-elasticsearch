package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.mock.web.reactive.function.server.MockServerRequest;


@Document(indexName = "users", type = "users", shards = 1)
public class Users {
    @JsonProperty("name")
    private  String name;

    @Id
    @JsonProperty("id")
    private Long id;

    @JsonCreator(mode= JsonCreator.Mode.PROPERTIES)
    public Users(String name, double salary, long l) {
        this.name = name;
        this.salary = salary;
        this.id = l;
    }

    @JsonProperty("salary")
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
