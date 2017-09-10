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
            new Topic("Spring", "Spring Course", "Spring Course Description"),
            new Topic("Java", "Core Java Course", "Core Java Course Description"),
            new Topic("JavaScript", "JavaScript Course", "JavaScript Course Description")
    );

    public List<Topic> getAllTopics() {
        return this.topics;
    }

    public Topic getTopic(String id) {
        return this.topics
                .stream()
                .filter(topic -> topic.getId().equalsIgnoreCase(id))
                .findFirst()
                .get();
    }
}