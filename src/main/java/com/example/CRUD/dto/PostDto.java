package com.example.CRUD.dto;

public class PostDto {
    private String title;
    private String content;
    private String mediaUrl;
    private Long userId;

    public PostDto() {
    }

    public PostDto(String title, String content, String mediaUrl, Long userId) {
        this.title = title;
        this.content = content;
        this.mediaUrl = mediaUrl;
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
