package mariellelopez.playground.posts;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.List;

public class CreatePostDTO {
    @NotBlank
    private String title;
    @NotNull
    private Date createdAt;
    @NotNull
    private Date modifiedAt;
    @NotBlank
    private String authour;
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

    public Date getCreatedAt() {
        return this.createdAt;
    };

    public Date getModifiedAt() {
        return this.modifiedAt;
    };

    public String getAuthour() {
        return this.authour;
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
