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
    private String authour;
    @Column
    private String introduction;
    @Column
    private String body;
    @Column
    private String conclusion;
    @Column
    private List<String> tags;
}
