package cs5800.assignment1.utils.composition;

public class File {
    private String name;

    public File() {
        this.setName("");
    }

    public File(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
