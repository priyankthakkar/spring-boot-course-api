package io.java.springbootquickstart.controller;

import io.java.springbootquickstart.model.Topic;
import io.java.springbootquickstart.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by priyankthakkar on 9/9/17.
 */
@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping(value = "/rest/api/v1/topics", method = RequestMethod.GET)
    public List<Topic> getAllTopics() {
        return this.topicService.getAllTopics();
    }

    @RequestMapping(value = "/rest/api/v1/topics/{id}", method = RequestMethod.GET)
    public Topic getTopic(@PathVariable("id") String id) {
        return this.topicService.getTopic(id);
    }
}