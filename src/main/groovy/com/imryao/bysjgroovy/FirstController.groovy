package com.imryao.bysjgroovy

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class FirstController {

    @Autowired
    private UserRepository userRepository

    @Autowired
    private MongoTemplate mongoTemplate

    @RequestMapping('/hello')
    public def index() {
        return userRepository.findByAccount('rongyao')
    }
}
