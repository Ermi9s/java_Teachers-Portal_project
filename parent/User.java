package parent;
public abstract class User {
    protected String name;
    protected int id;
    protected String password;

    public User(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }
}

