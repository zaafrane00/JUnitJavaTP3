package classe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pays {
    private String label;
    private List<Person> Persons;
    private int personsLength;

    public Pays(String label) {
        this.label = label;
        Persons = new ArrayList<Person>();
    }

    public void addPerson(Person p){
        this.Persons.add(p);
        System.out.println(p.getNom()+"added");
    }

    public void deletePeron(int id){
        Person x=this.Persons.get(id);
        if(x!=null){
            this.Persons.remove(id);
            System.out.println(x.getNom()+"deleted");
        }else{
            System.out.println("Not Found");
        }
    }

    public void editPerson(Person p){
       Boolean ok=this.Persons.contains(p);
       if(ok){
           int pos=this.Persons.indexOf(p);
           //Person x=this.Persons.get(pos);
           this.Persons.set(pos,p);
           System.out.println(p.getNom()+"updated");
       }else{
           System.out.println(p.getNom()+"Not Found");
       }
    }

    public void affiche(){
        System.out.println(Arrays.deepToString(this.Persons.toArray()));
    }

}
