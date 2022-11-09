import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class SocieteHashMap implements InterfaceSociete{
HashMap<Departement,Set<Employe>> map = new HashMap<Departement,Set<Employe>>();

    @Override
    public void ajouterEmployeDepartement(Employe e,Departement d){
        HashSet <Employe> s ;
        if(rechercherEmploye(e)){
            System.out.println("Employe existe ");
        }
        else {
            if (rechercherDepartement(d)){
                s = new HashSet <Employe>(map.get(d)) ;
            }
            else{
                s= new HashSet<Employe>();

            }
            s.add(e);
            map.put(d,s);
        }
       


    }

    public void supprimerEmploye(Employe e){
        for (Map.Entry<Departement,Set<Employe>> mapr:map.entrySet()) {
        if (mapr.getValue().contains(e)){
            mapr.getValue().remove(e);
                break;
        }
        }

    }
public void afficherLesEmployesLeursDepartements(){
    for(Map.Entry<Departement,Set<Employe>> mapa:map.entrySet()){
        System.out.println(mapa.getKey()+" " + mapa.getValue());
    }

}
public void afficherLesEmployes(){
    System.out.println(map.values());

}
public void afficherLesDepartements(){

        System.out.println(map.keySet());

}
public void afficherDepartement(Employe e){
    for (Map.Entry<Departement,Set<Employe>> mapr:map.entrySet()) {
        if (mapr.getValue().contains(e)){
System.out.println(mapr.getKey());   
       
      break;
        }
    }


}
public boolean rechercherEmploye(Employe e){
    for (Map.Entry<Departement,Set<Employe>> mapr:map.entrySet()) {
        if (mapr.getValue().contains(e)){
            return true ;
        }
    }
    return false;

}
public boolean rechercherDepartement(Departement e){
    return map.containsKey(e) ;

}
}

