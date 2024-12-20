package BT4;

public class Student {
    private String id;
    private String name;
    private int age;

    // Constructor
    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to get student information in a formatted string
    public String getInfo() {
        return String.format("Student [id=%s, name=%s, age=%d]", id, name, age);
    }
}
