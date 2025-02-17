package mariellelopez.playground.posts;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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

    public Optional<Post> updatePostById(Long id, @Valid UpdatePostDTO data) {
        Optional<Post> foundPost = this.postRepository.findById(id);

        if (foundPost.isEmpty()) {
            return foundPost;
        };

        Post updatedPost = foundPost.get();

        if (data.getTitle() != null) {
            updatedPost.setTitle(data.getTitle());
        };

        if (data.getAuthor() != null) {
            updatedPost.setAuthor(data.getAuthor());
        };

        if (data.getIntroduction() != null) {
            updatedPost.setIntroduction(data.getIntroduction());
        };

        if (data.getBody() != null) {
            updatedPost.setBody(data.getBody());
        };

        if (data.getConclusion() != null) {
            updatedPost.setConclusion(data.getConclusion());
        };

        if (data.getTags() != null) {
            updatedPost.setTags(data.getTags());
        };

        updatedPost.setModifiedAt(new Date());

        return Optional.of(updatedPost);
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
