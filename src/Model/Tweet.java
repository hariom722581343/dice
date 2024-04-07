package Model;

public class Tweet {
    private String id;
    private String text;
    private User user;
    // Other tweet properties

    public Tweet() {
    }

    public Tweet(String id, String text, User user) {
        this.id = id;
        this.text = text;
        this.user = user;
    }

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

