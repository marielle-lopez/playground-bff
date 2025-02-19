package mariellelopez.playground.posts;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private Date createdAt;
    @Column
    private Date modifiedAt;
    @Column
    private String author;
    @Column
    private String introduction;
    @Column
    private String body;
    @Column
    private String conclusion;
    @Column
    private List<String> tags;

    public Long getId() {
        return this.id;
    };

    public void setId(Long id) {
        this.id = id;
    };

    public String getTitle() {
        return this.title;
    };

    public void setTitle(String title) {
        this.title = title;
    };

    public Date getCreatedAt() {
        return this.createdAt;
    };

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    };

    public Date getModifiedAt() {
        return this.modifiedAt;
    };

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    };

    public String getAuthor() {
        return this.author;
    };

    public void setAuthor(String author) {
        this.author = author;
    };

    public String getIntroduction() {
        return this.introduction;
    };

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    };

    public String body() {
        return this.body;
    };

    public void setBody(String body) {
        this.body = body;
    };

    public String getConclusion() {
        return this.conclusion;
    };

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    };

    public List<String> getTags() {
        return this.tags;
    };

    public void setTags(List<String> tags) {
        this.tags = tags;
    };
}
