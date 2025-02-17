package mariellelopez.playground.posts;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping
    public String getAllPosts() {
        return postService.getAllPosts();
    };

    @GetMapping("/{id}")
    public String getPostById(@PathVariable int id) {
        return postService.getPostById(id);
    };

    @PostMapping
    public String createPost(@Valid @RequestBody CreatePostDTO data) {
        return postService.createPost(data);
    };
}
