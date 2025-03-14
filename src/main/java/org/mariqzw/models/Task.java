package org.mariqzw.models;

import jakarta.persistence.*;
import org.mariqzw.enums.Priority;
import org.mariqzw.enums.Status;

@Entity
@Table(name = "tasks")
public class Task extends BaseEntity {
    private String title;
    private String description;
    @Enumerated(EnumType.STRING)
    private Status status;
    @Enumerated(EnumType.STRING)
    private Priority priority;
    @ManyToOne
    private User author;
    @ManyToOne
    private User assignee;

    public Task(String title, String description, Status status, Priority priority, User author, User assignee) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.author = author;
        this.assignee = assignee;
    }

    protected Task() {}

    @Column(name = "title", nullable = false, length = 50)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "description", nullable = false, length = 300)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "status", nullable = false)
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Column(name = "priority", nullable = false)
    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @JoinColumn(name = "author_id", referencedColumnName = "id", nullable = false)
    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @JoinColumn(name = "assignee_id", referencedColumnName = "id", nullable = false)
    public User getAssignee() {
        return assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", priority=" + priority +
                ", author=" + author +
                ", assignee=" + assignee +
                '}';
    }
}
