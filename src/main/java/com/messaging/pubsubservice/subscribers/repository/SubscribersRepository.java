package com.messaging.pubsubservice.subscribers.repository;

import com.messaging.pubsubservice.subscribers.entity.Subscribers;
import org.springframework.data.repository.CrudRepository;

public interface SubscribersRepository extends CrudRepository<Subscribers, Integer> {
}
