package UI;

import javax.swing.JFrame;

public class namesUI extends JFrame {

	/* List of buttons */
	
	private static final long serialVersionUID = 1L;
	String file;
	String edit;
	String save;
	String export;
	String quit;
	String anim_wind;
	String results;
	String transName;
	String help;
	String apply;
	String getHelp;
	
	


	public namesUI(int a) {
		if(a==1){
			setEnglishLabels();
		}
		if(a==2){
			setPolishLabels();
		}

	}
	void setEnglishLabels(){
		file="File";
		edit="Edit";
		save="Save";
		export="Export";
		quit="Quit";
		anim_wind="Animation window";
		results="Export Results";
		transName="Model";
		help="Help";
		apply="Apply";
		getHelp="Info";
	}
	void setPolishLabels(){
		file="Plik";
		edit="Edytuj";
		save="Zapisz";
		export="Wyeksportuj";
		quit="Wyjdz";
		anim_wind="Okno animacji";
		results="Wyeksportuj Wyniki";
		transName="Model";
		help="Pomoc";
		apply="Zatwierdz";
		getHelp="Info";
		
	}
}