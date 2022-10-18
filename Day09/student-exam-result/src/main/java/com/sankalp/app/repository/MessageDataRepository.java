package com.sankalp.app.repository;

import com.sankalp.app.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageDataRepository extends CrudRepository<Message, Integer> {
}
