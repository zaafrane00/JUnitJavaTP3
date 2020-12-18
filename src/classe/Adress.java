package classe;

public class Adress {
    private String rue;
    private String ville;
    private String num;

    public String getRue() {
        return rue;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "rue='" + rue + '\'' +
                ", ville='" + ville + '\'' +
                ", num='" + num + '\'' +
                '}';
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
