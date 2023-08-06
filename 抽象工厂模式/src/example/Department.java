package example;

public class Department {
    private String name;
    private int number;

    public Department(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    public Department() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
