import java.util.ArrayList;
import java.util.Arrays;

public class Post {
    private String title;
    private String content;
    private String[] tags;
    private ArrayList<PostComment> comments;

    // Геттеры и сеттеры
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public ArrayList<PostComment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<PostComment> comments) {
        this.comments = comments;
    }

    // Переопределение toString
    @Override
    public String toString() {
        String contentLength = (content == null) ? "0" : String.valueOf(content.length());
        String tagsString = (tags == null) ? "null" : Arrays.toString(tags);
        String commentsString = (comments == null) ? "null" : comments.toString();

        return "Post{" +
                "title='" + title + '\'' +
                ", content.length=" + contentLength +
                ", tags=" + tagsString +
                ", comments=" + commentsString +
                '}';
    }
}


