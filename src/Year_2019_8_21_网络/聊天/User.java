package Year_2019_8_21_网络.聊天;

public class User {
    private String from;
    private String message;
    private String to;

    public User(String from, String message, String to) {
        this.from = from;
        this.message = message;
        this.to = to;
    }

    public void setFrom(String from) {

        this.from = from;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public String getMessage() {
        return message;
    }

    public String getTo() {
        return to;
    }
}
