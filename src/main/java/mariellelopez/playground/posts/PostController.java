package mariellelopez.playground.posts;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping
    public ResponseEntity<List<Post>> getAllPosts() {
        List<Post> events = this.postService.getAllPosts();

        return new ResponseEntity<>(events, HttpStatus.OK);
    };

    @GetMapping("/{id}")
    public ResponseEntity<Post> getPostById(@PathVariable Long id) {
        Optional<Post> maybePost = this.postService.getPostById(id);
        Post foundPost = maybePost.orElseThrow(() -> new RuntimeException("Post not found"));

        return new ResponseEntity<>(foundPost, HttpStatus.OK);
    };

    @PostMapping
    public ResponseEntity<Post> createPost(@Valid @RequestBody CreatePostDTO data) {
        Post createdPost = this.postService.createPost(data);

        return new ResponseEntity<>(createdPost, HttpStatus.CREATED);
    };

    @PatchMapping("/{id}")
    public ResponseEntity<Post> updatePostById(@PathVariable Long id, @Valid @RequestBody UpdatePostDTO data) {
        Optional<Post> maybePost = this.postService.updatePostById(id, data);
        Post updatedPost = maybePost.orElseThrow(() -> new RuntimeException("Post not found"));

        return new ResponseEntity<>(updatedPost, HttpStatus.OK);
    };

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deletePost(@PathVariable Long id) {
        Boolean deleted = this.postService.deletePostById(id);

        if (!deleted) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
