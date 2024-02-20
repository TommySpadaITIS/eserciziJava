import java.util.Scanner;

public class spadaTommasoAcquisizioneTastiera{
	public static String acquisition(String name, String surname, String team, Scanner scan){
		System.out.println("inserire nome, cognome e squadra del cuore:");
		name = scan.nextLine();
		surname = scan.nextLine();
		team = scan.nextLine();
		return "ciao " + name + " " + surname + "! la tua squadra del cuore e' " + team;
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String name = "";
		String surname = "";
		String team = "";

		String result = acquisition(name, surname, team, scan);
		System.out.println(result);
	}
}
