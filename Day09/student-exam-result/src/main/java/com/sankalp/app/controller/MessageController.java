package com.sankalp.app.controller;

import com.sankalp.app.model.Message;
import com.sankalp.app.model.Users;
import com.sankalp.app.model.Message;
import com.sankalp.app.repository.MessageDataRepository;
import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/message")
public class MessageController {

    @Autowired
    MessageDataRepository messageDataRepository;

    @GetMapping(value = "/read")
    public @ResponseBody
    Iterable<Message> getAll() {
        return messageDataRepository.findAll();
    }

    @PostMapping(value = "/create")
    public @ResponseBody
    String store(@RequestBody final Message message) {
        messageDataRepository.save(message);
        return "saved";
    }
}
