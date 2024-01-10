package parent;
public abstract class User {
    protected String name;
    protected int id;
    protected String password;
    protected String email;
    protected String section;

    public User(String name, int id, String password, String email , String sec) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.email = email;
        this.section = sec;
    }
}

