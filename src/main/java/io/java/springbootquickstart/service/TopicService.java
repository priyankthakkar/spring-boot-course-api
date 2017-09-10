package io.java.springbootquickstart.service;

import io.java.springbootquickstart.model.Topic;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by priyankthakkar on 11/9/17.
 */
@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic(1, "Topic One", "Topic One Description"),
            new Topic(2, "Topic Two", "Topic Two Description"),
            new Topic(3, "Topic Three", "Topic Three Description")
    );

    public List<Topic> getAllTopics() {
        return this.topics;
    }
}