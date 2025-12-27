package com.opencode.alumxbackend.jobposts.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Getter
@Setter
@Table(name = "job_posts")
public class JobPost {
    @Id
    private String postId;
    @Column(nullable = false)
    private String username;
    @Column(length = 2000)
    private String description;
    @ElementCollection
    @CollectionTable(name = "job_post_images", joinColumns = @JoinColumn(name = "post_id"))
    @Column(name = "image_url")
    private List<String> imageUrls;
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    public String getPostId() {
        return postId;
    }

    public String getUsername() {
        return username;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
