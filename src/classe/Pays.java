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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void editPerson(Person p){
        int pos=-1;
            for(int i=0;i<=this.Persons.size();i++){
                if(this.Persons.get(i).getId()==p.getId()){
                    pos=i;
                    break;
                }
            }
            if(pos!=-1){
                Person x=this.Persons.get(pos);
                if(x.getId()==p.getId()) {
                    this.Persons.set(pos, p);
                    System.out.println(p.getNom() + "updated");
                }
            }else
                System.out.println("not found");
    }

    public void affiche(){
        System.out.println(Arrays.deepToString(this.Persons.toArray()));
    }

    public int getPersonsLength(){
         this.personsLength=this.Persons.size();
         return this.personsLength;
    }

    public static void main(String ...args){
        Pays pays=new Pays("tunisie");
        pays.addPerson(new Person(1,"hamza",25,new Adress("rue palestinne","lamta","5099")));
        pays.addPerson(new Person(2,"hamza2",255,new Adress("rue 8651","lamta","1236")));
        pays.addPerson(new Person(3,"hamza2",254,new Adress("rue qsfq","qsfqsf","895")));

        Person p=new Person(2,"hello",254,new Adress("rue qsfq","qsfqsf","895"));
       // pays.addPerson(p);
       /* pays.deletePeron(2);*/
        pays.affiche();
        pays.editPerson(p);
        System.out.println("after");
        pays.affiche();

    }

}
