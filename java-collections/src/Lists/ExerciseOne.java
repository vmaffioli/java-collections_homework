package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciseOne {

	static List<Integer> inputs = new ArrayList<Integer>();
	static Scanner sc = new Scanner(System.in);

	public static void receiveInputs() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Insira uma temperatura (somente numeros):");
			inputs.add(sc.nextInt());
			System.out.println((i + 1) + "/5");
		}		
	}
	
	public static int calculateAverage() {
		int average = 0;
		System.out.println("Calculando ...");
		for(int i=0; i < inputs.size(); i++) {
			average += inputs.get(i);
		}
		average /= inputs.size();
		System.out.println("Temperatura média: " + "°C");
		return average;
	}
	
	public static void printGreater(int average) {
		System.out.println("Temperatura(s) acima da média:");
		for (Integer value : inputs) {
			if(value>average) {
				System.out.println(value + "°C");
			}
		}
	}
	
	public static void main(String[] args) {
		
		receiveInputs();
		printGreater(calculateAverage());
		
	}


}
