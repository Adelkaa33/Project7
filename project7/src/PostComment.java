import java.util.Arrays;

public class PostComment {
    private String text;
    private String[] whoLiked;

    // Геттеры и сеттеры
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String[] getWhoLiked() {
        return whoLiked;
    }

    public void setWhoLiked(String[] whoLiked) {
        this.whoLiked = whoLiked;
    }

    // Переопределение toString
    @Override
    public String toString() {
        String whoLikedString = (whoLiked == null) ? "null" : Arrays.toString(whoLiked);
        return "PostComment{" +
                "text='" + text + '\'' +
                ", whoLiked=" + whoLikedString +
                '}';
    }
}