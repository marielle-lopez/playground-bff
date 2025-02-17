package mariellelopez.playground.posts;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    };

    @GetMapping("/{id}")
    public Optional<Post> getPostById(@PathVariable Long id) {
        return postService.getPostById(id);
    };

    @PostMapping
    public Post createPost(@Valid @RequestBody CreatePostDTO data) {
        return postService.createPost(data);
    };

    @DeleteMapping("/{id}")
    public Boolean deletePost(@PathVariable Long id) {
        return postService.deletePostById(id);
    }
}
