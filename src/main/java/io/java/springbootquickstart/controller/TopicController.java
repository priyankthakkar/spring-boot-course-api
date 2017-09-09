package io.java.springbootquickstart.controller;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import io.java.springbootquickstart.model.Topic;

/**
 * Created by priyankthakkar on 9/9/17.
 */
@RestController
public class TopicController {

    @RequestMapping(value = "/rest/api/v1/courses/topics", method = RequestMethod.GET)
    public List<Topic> getTopics() {

        Topic[] topics = {
                new Topic(1, "Topic One", "Topic One Description"),
                new Topic(2, "Topic Two", "Topic Two Description"),
                new Topic(3, "Topic Three", "Topic Three Description")
        };

        return Arrays.asList(topics);
    }
}