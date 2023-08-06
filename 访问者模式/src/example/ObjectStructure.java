package example;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<Person> list = new ArrayList<>();

    public void add(Person person){
        this.list.add(person);
    }

    public void remove(Person person){
        this.list.remove(person);
    }

    public void accept(Status status){
        for (Person person : this.list) {
            person.accept(status);
        }
    }
}
