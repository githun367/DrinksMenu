import java.util.Scanner;
import java.util.ArrayList;

class DrinksMenu{
	
	
public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	ArrayList<String> options = new ArrayList<>();
	ArrayList<String> choices = new ArrayList<>();


	System.out.println("hvor gammel er du? ");
	String input = scan.nextLine();
	int age = Integer.parseInt(input);

	if(age >= 18){
		options.add("Gin & Tonic");
		options.add("Vodka Redbull");
		options.add("Pornstar Martini");
	} else {
		options.add("Appelsin juice");
		options.add("Æble juice");
		options.add("Vand");
	}

	int counter = 1;
	for(String o : options ){
		System.out.println(counter + ". " + o);
		counter ++;
	}

	System.out.println("Hvor mange drinks vil du bestille?");
	String input2 = scan.nextLine();
	int numberOfDrinks = Integer.parseInt(scan.nextLine());


	while(choices.size() < numberOfDrinks){
		System.out.println(" vælg en drink fra listen");
		String choice = scan.nextLine();
		choices.add(choice);
	}

	for(String c : choices ){
		System.out.println("your choice: " + c);


	}
	
}
}