

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.List;

public class JavaApplicationCollections{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InterfaceFonc<Employe> interf = Employe::new;
        Supplier
          
        interf.helloWorld();
        System.out.println( interf.ajouterTriangle());

        Employe e0 = new Employe(101, "ghrab", "melek",15846252);
        Employe e1 = new Employe(102, "benrjab", "abdallah",1425425);
        // Employe e2 = new Employe(103,3, "ahmed", "ahmed");
        // EspritHashSet e = new EspritHashSet();
		// EspritTreeSet eee = new EspritTreeSet();
        // SocieteHashMap e = new SocieteHashMap ();
        SocieteTreeMap eee = new SocieteTreeMap() ;


        
        Departement d0 = new Departement(2,"Info");
		Departement d1 = new Departement(1,"Tech");
        eee.ajouterEmployeDepartement(e0, d0);
		eee.ajouterEmployeDepartement(e1, d1);
		
		eee.afficherLesEmployesLeursDepartements();
		System.out.println(eee.rechercherDepartement(d1));
		
		eee.afficherLesEmployes();
		eee.afficherLesDepartements();
		
		eee.supprimerEmploye(e1);
		System.out.println("--------------");
		eee.afficherLesEmployes();
		eee.afficherDepartement(e0);
 


















        
        // e.ajouterEmploye(e0);
        // e.ajouterEmploye(e1);
        // e.ajouterEmploye(e2);
        // // e.displayEmployes();
        // e.supprimerEmploye(e2);
        


        // eee.ajouterEmploye(e0);
        // eee.ajouterEmploye(e1);
        // eee.ajouterEmploye(e2);
        // eee.displayEmployes();
        // eee.supprimerEmploye(e2);
       


        
        System.out.println("***");
        

        
    }
    
}
