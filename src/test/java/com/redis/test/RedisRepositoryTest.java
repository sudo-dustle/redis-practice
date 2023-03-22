package com.redis.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class RedisRepositoryTest {

    @Autowired
    private PersonRedisRepository repository;

    @Test
    void test() {
        Person person = new Person("Dustle", 25);

        repository.save(person);

        Optional<Person> optionalPerson = repository.findById(person.getId());

        repository.count();

        repository.delete(person);
    }
}
