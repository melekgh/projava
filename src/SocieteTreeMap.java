
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SocieteTreeMap implements InterfaceSociete  {
	Map <Departement,Set<Employe>> map1 = new TreeMap <Departement,Set<Employe>>();
	
	@Override
	public void ajouterEmployeDepartement(Employe e, Departement d) {
		HashSet<Employe>s ;
		if (rechercherEmploye(e)) {
			System.out.println("Employe exist .. ! ");
		}
		else
		{
			if(rechercherDepartement(d)) {
				s = new HashSet<Employe>( map1.get(d));
			}
			else 
			{
				s = new HashSet<Employe>() ;
			}
			s.add(e);
			map1.put(d, s);
		}
	}

	@Override
	public void supprimerEmploye(Employe e) {
		for (Map.Entry<Departement, Set<Employe >> mapR : map1.entrySet()){
			if (mapR.getValue().contains(e)) {
				mapR.getValue().remove(e);
				break;
			}
		
		}

	}

	@Override
	public void afficherLesEmployesLeursDepartements() {
		for (Map.Entry<Departement, Set<Employe>> mapA : map1.entrySet()) {
			System.out.println(mapA.getKey()+" " + mapA.getValue());
		}
	}

	@Override
	public void afficherLesEmployes() {
			System.out.println(map1.values());
		
	}

	@Override
	public void afficherLesDepartements() {
		System.out.println(map1.keySet());
		
	}

	@Override
	public void afficherDepartement(Employe e) {
		for (Map.Entry<Departement, Set<Employe >> mapR : map1.entrySet()){
			if (mapR.getValue().contains(e)) {
				System.out.println(mapR.getKey());
				break;
			}
		
		}
		
	}

	@Override
	public boolean rechercherEmploye(Employe e) {
		for (Map.Entry<Departement, Set<Employe >> mapR : map1.entrySet()){
			if (mapR.getValue().contains(e)) {
				return true ;
			}
		}
		return false;
	} 

	@Override
	public boolean rechercherDepartement(Departement e) {
		return map1.containsKey(e);
	}
	
}