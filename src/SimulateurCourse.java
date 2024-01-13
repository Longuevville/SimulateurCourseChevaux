import java.util.Scanner;
import java.util.Random;

public class SimulateurCourse {

	public static void main(String[] args) {
		// Init scan input user
		// Define scan
		// Init random class
		//init loop while true input number of horses
		//Display question about number of horses
		//read question
		//start condition for negative answer
		//exit of loop

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		boolean continuer = true;
		
		while (continuer){
			System.out.println("Entrer le nombre de cheveaux (entre 12 et 20) ou taper 0 pour annuler : ");
			int nombreDeChevaux = scan.nextInt();
			
			if (nombreDeChevaux < 12 || nombreDeChevaux > 20) {
				System.out.println("le nombre de chevaux doit être entre 12 t 20. Veuillez réessayer.");
				continue;
			}
			
			System.out.print("Entrez le type dee cours désiré (tiercé, quinté, quarté ) : ");
            String typeCourse = scan.next();

			
			if(!(typeCourse.equals("tiercé") || typeCourse.equals("quarté") || typeCourse.equals("quinté"))){
				System.out.print("Ce n'est pas un bon type de course, réssayer");
				continue;
		
		}
			simulerArrivee(typeCourse,  nombreDeChevaux, rand);
			System.out.println("Veeux tu simuler une autre course ? (oui/non) : ");
			String reponse = scan.next().toLowerCase();
            continuer = reponse.equals("oui");

			
}
		
		System.out.println("Merci d'avoir utilisé le simulateur de courses hippiques !");
}

	
	//expressions conditionnelles 
	private static void simulerArrivee(String typeCourse, int nombreDeChevaux, Random random) {
		int nombreDeGagnants;
		
		switch (typeCourse) {
		case "tiercé":
			nombreDeGagnants = 3;
			break;
		case "quarté":
			nombreDeGagnants = 4;
			break;
		case "quinté":
			nombreDeGagnants = 5;
			break;
		default:
			nombreDeGagnants = 0; //zeubi c'est imposs
		}		
		
	System.out.print("Arrivée du " + typeCourse + " : ");
	for (int z = 0; z < nombreDeGagnants; z++){
		int position = random.nextInt(nombreDeChevaux) + 1;
		System.out.print(position);
		if(z < nombreDeGagnants -1) {
			System.out.print(" - ");
		}
	}
		}
		}
		
	

