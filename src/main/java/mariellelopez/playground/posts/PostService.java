package mariellelopez.playground.posts;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public String getAllPosts() {
        return "This gets all of the posts.";
    };

    public String getPostById(int id) {
        return "This gets the post with ID: " + id + ".";
    };

    public String createPost(@Valid CreatePostDTO data) {
        return "This creates a post with the title: " + data.getTitle() + ".";
    };
}
