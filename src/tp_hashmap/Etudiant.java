package tp_hashmap;
import java.util.HashMap;

public class Etudiant {
	String nom;
	HashMap<String, Integer> noteParModule = new HashMap<>(); // une seule note par module
	
	Etudiant(String nom){
		this.nom = nom;
	}
	
	void setNote(String module, int note){
		noteParModule.put(module, new Integer(note));
	}
	
	int getNote(String module){
		return noteParModule.get(module);
	}
}
