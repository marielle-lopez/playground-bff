package mariellelopez.playground.posts;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.List;

public class CreatePostDTO {
    @NotBlank
    private String title;
    @NotNull
    private LocalDateTime createdAt;
    @NotNull
    private LocalDateTime modifiedAt;
    @NotBlank
    private String author;
    @NotBlank
    private String introduction;
    @NotBlank
    private String body;
    @NotBlank
    private String conclusion;
    @NotEmpty
    private List<String> tags;

    public String getTitle() {
        return this.title;
    };

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    };

    public LocalDateTime getModifiedAt() {
        return this.modifiedAt;
    };

    public String getAuthor() {
        return this.author;
    };

    public String getIntroduction() {
        return this.introduction;
    };

    public String getBody() {
        return this.body;
    };

    public String getConclusion() {
        return this.conclusion;
    };

    public List<String> getTags() {
        return this.tags;
    };
}
