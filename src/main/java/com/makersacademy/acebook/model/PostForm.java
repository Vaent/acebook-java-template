package com.makersacademy.acebook.model;

public class PostForm {

    private String content;
    private int votes;

    public PostForm(String content, int votes) {
        this.content = content;
        this.votes = votes;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

}
