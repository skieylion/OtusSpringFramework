package spring.homework.domain;

public class Author {
    private long id;
    private String fullName;
    private String alias;

    public Author(long id, String fullName, String alias) {
        this.id = id;
        this.fullName = fullName;
        this.alias = alias;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Author(String fullName, String alias) {
        this.fullName = fullName;
        this.alias = alias;
    }

    public Author(long id) {
        this.id = id;
    }


    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAlias() {
        return alias;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", alias='" + alias + '\'' +
                '}';
    }
}
