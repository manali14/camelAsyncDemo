import java.util.Date;

class InputRequest {
    private Date date;
    private String language;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public InputRequest(Date date, String language, String name) {
        this.date = date;
        this.language = language;
        this.name = name;
    }

    @Override
    public String toString() {
        return "InputRequest{" +
                "date=" + date +
                ", language='" + language + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}