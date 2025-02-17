package mariellelopez.playground.posts;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return this.postRepository.findAll();
    };

    public Optional<Post> getPostById(Long id) {
        return this.postRepository.findById(id);
    };

    public Post createPost(@Valid CreatePostDTO data) {
        Post newPost = new Post();

        newPost.setTitle(data.getTitle());
        newPost.setCreatedAt(data.getCreatedAt());
        newPost.setModifiedAt(data.getModifiedAt());
        newPost.setAuthor(data.getAuthor());
        newPost.setIntroduction(data.getIntroduction());
        newPost.setBody(data.getBody());
        newPost.setConclusion(data.getConclusion());
        newPost.setTags(data.getTags());

        return this.postRepository.save(newPost);
    };

    public Boolean deletePostById(Long id) {
        Optional<Post> foundPost = this.postRepository.findById(id);

        if (foundPost.isEmpty()) {
            return false;
        }

        this.postRepository.delete(foundPost.get());
        return true;
    };
}
