package com.imryao.bysjgroovy

import org.springframework.data.mongodb.repository.MongoRepository

public interface UserRepository extends MongoRepository<User, Long> {
    User findByAccount(String account)
}
