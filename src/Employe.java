public class Employe implements Comparable<Employe>{
    //att
    private int id;
    private String nom;
    private String prenom;
    private int cin;
    
    //constructor
    public Employe(){}
    //..
    public Employe (int id, String nom, String prenom,int cin){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.cin=cin;
    }
    
    //Getters and setters
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public int getcin() {
        return cin;
    }

    public void setcin(int cin) {
        this.cin = cin;
    }

    
    //equals
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof Employe){
            return this.getId() == ((Employe) obj).getId();
        }else {
            return false;
        }
    }
    
    //show
    @Override
    public String toString() {
        return "Employe{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom +",cin"+ cin+'}';
    }

    @Override
    public int compareTo(Employe o) {
        return o.getId() - this.getId();
    }
}
    
    