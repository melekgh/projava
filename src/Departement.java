public class Departement implements Comparable<Departement>{
    //att
    private int id;
    private String nom;
    
    
    //constructor
    public Departement(){}
    //..
    public Departement (int id, String nom){
        this.id = id;
        this.nom = nom;
        
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

    
    
    //equals
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof Departement){
            return this.getId() == ((Departement) obj).getId();
        }else {
            return false;
        }
    }
    
    //show
    @Override
    public String toString() {
        return "Departement{" + "id=" + id + ", nom=" + nom + ", prenom=" + '}';
    }

    @Override
    public int compareTo(Departement o) {
        return o.getId() - this.getId();
    }
}
    
    