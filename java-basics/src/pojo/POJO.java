package pojo;

public class POJO {
    int id;
    String name;

    public POJO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public POJO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
