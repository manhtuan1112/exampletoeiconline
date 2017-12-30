package com.mitrais.core.persistence.entity;

import javax.persistence.*;

/**
 * Created by duongtuan1211 on 12/30/2017.
 */

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentId;

    @Column(name = "content")
    private String content;

    @Column(name = "createddate")
    private String createdDate;

    @ManyToOne
    @JoinColumn(name="userid")
    private User user;

    @ManyToOne
    @JoinColumn(name="listenguidelineid")
    private ListenGuideLine listenGuideLine;
    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ListenGuideLine getListenGuideLine() {
        return listenGuideLine;
    }

    public void setListenGuideLine(ListenGuideLine listenGuideLine) {
        this.listenGuideLine = listenGuideLine;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

}
