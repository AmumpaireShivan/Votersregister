package votersregister;
import java.util.ArrayList;
import java.util.Scanner;
public class Votersregister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input= new Scanner(System.in);
	
	ArrayList<String>voters=new ArrayList<>();
	String voterName;
	int numberOfvoters;
	
	System.out.print("Enter the number of voters to register:");
	numberOfvoters=input.nextInt();
	
	
	
	
	for(int i=0; i<numberOfvoters; i++) {
		System.out.print("Enter the name of voter" + (i+1)+ ":");
		voterName =input.next();
		
		if (!voterName.isEmpty()) {
			voters.add(voterName);
			System.out.println("Name cannot be empty.Please enter a valid name.");
		}
		
//		else {
//			System.out.println("Name cannot be empty.Please enter a valid name.");
//			
//		}
	}
//	
	System.out.println("Registered Voters:");
	for(String voter:voters) {
		System.out.println(voter);
		
		
		
	}
	
	
	}
	
	}
