package io.java.springbootquickstart.controller;

import io.java.springbootquickstart.model.Topic;
import io.java.springbootquickstart.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/rest/api/v1/topics", method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic) {
        this.topicService.addTopic(topic);
    }

    @RequestMapping(value = "/rest/api/v1/topics/{id}", method = RequestMethod.PUT)
    public void updateTopic(@PathVariable("id") String id, @RequestBody Topic updatedTopic) {
        this.topicService.updateTopic(id, updatedTopic);
    }

    @RequestMapping(value = "/rest/api/v1/topics/{id}", method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable("id") String id) {
        this.topicService.deleteTopic(id);
    }
}