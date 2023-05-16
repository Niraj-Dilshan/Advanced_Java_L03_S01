package com.ictec.springbootdemo;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "project", schema = "project", catalog = "")
public class ProjectEntity {
    @Id
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "cordinator")
    private String cordinator;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCordinator() {
        return cordinator;
    }

    public void setCordinator(String cordinator) {
        this.cordinator = cordinator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectEntity that = (ProjectEntity) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(cordinator, that.cordinator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, cordinator);
    }

    @Override
    public String toString() {
        return "ProjectEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", cordinator='" + cordinator + '\'' +
                '}';
    }
}
