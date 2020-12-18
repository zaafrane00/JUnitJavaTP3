package classe;

public class Person {
    private int id;
    private String nom;
    private int age;
    private Adress adress;

    public Person(String nom, int age, Adress adress) {
        this.nom = nom;
        this.age = age;
        this.adress = adress;
    }
    public Person(Person p) {
        this.nom = p.nom;
        this.age = p.age;
        this.adress = p.adress;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                ", adress=" + adress +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
