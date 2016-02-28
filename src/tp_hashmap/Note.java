package tp_hashmap;
import java.util.HashMap;
import java.util.Random;
import javax.swing.JOptionPane;

public class Note {
	public static void main(String[] args){
		Random r = new Random();
		HashMap<String, Integer[]> notes = new HashMap<>();
		String[] nom = new String[5];
		Integer[][] note = new Integer[5][5];
		
		nom[0] = "Pierre";
		nom[1] = "Paul";
		nom[2] = "Jacques";
		nom[3] = "Vincent";
		nom[4] = "François";
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				note[i][j] = (int)(r.nextInt(11)+10);
			}
			notes.put(nom[i], note[i]);
		}
		System.out.println(notes.get("Pierre")[0]);
		
		String nomInput;
		String notesAfficher = "";
		do{
			nomInput= JOptionPane.showInputDialog("Entez un nom");
			if(!notes.containsKey(nomInput)){
				JOptionPane.showMessageDialog(null, "L'étudiant "+nomInput+" n'existe pas.");
			}else{
				for(Integer noteA : notes.get(nomInput)){
					notesAfficher = notesAfficher + noteA+" ";
				}
				JOptionPane.showMessageDialog(null, "Les notes de l'étudiant "+nomInput+" sont: "+notesAfficher);
			}
		}while(!notes.containsKey(nomInput));
		
		HashMap<String, Etudiant> etudiants = new HashMap<>();
		etudiants.put("Jean", new Etudiant("Jean"));
		etudiants.get("Jean").setNote("Math", 12);
		System.out.println(etudiants.get("Jean").getNote("Math"));
		
	}
}
