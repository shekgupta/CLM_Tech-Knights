package com.bmc.innov8.cloud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bmc.innov8.cloud.bean.Message;

public interface MessageRepository<T extends Message> extends MongoRepository<Message, String> {

}
