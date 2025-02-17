package mariellelopez.playground.posts;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.util.List;

public class UpdatePostDTO {
    @Pattern(regexp = "^(?=\\S).*$", message = "Title cannot be empty")
    private String title;
    @Pattern(regexp = "^(?=\\S).*$", message = "Author cannot be empty")
    private String author;
    @Pattern(regexp = "^(?=\\S).*$", message = "Introduction cannot be empty")
    private String introduction;
    @Pattern(regexp = "^(?=\\S).*$", message = "Body cannot be empty")
    private String body;
    @Pattern(regexp = "^(?=\\S).*$", message = "Conclusion cannot be empty")
    private String conclusion;
    private List<@NotNull String> tags;

    public String getTitle() {
        return this.title;
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
