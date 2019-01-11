package com.makersacademy.acebook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

import lombok.Data;

@Data
@Entity
@Table(name = "POSTS")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private int votes;

    private Post() {
    }

    public Post(String content, int votes) {
        this.content = content;
        this.votes = votes;
    }

    public String getContent() {
        return content;
    }

    public int getVotes() {
        return votes;
    }
}
