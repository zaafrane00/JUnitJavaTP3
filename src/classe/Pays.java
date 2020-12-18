package classe;

import java.util.ArrayList;
import java.util.List;

public class Pays {
    private String label;
    private List<Person> Persons;
    private int personsLength;

    public Pays(String label,) {
        this.label = label;
        Persons = new ArrayList<Person>();
    }

    public void addPerson(Person p){
        this.Persons.add(p);
        System.out.println(p.getNom()+"added");
    }

    public deletePeron(int id){}
}
