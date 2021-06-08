package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciseTwo {

	static List<String> questions = new ArrayList<String>();
	static Scanner sc = new Scanner(System.in);

	static void init() {
		questions.add("Telefonou para a vitima?");
		questions.add("Esteve no local do crime?");
		questions.add("Mora perto da vitima?");
		questions.add("Devia para a vitima?");
		questions.add("J� trabalhou com a vitima?");
	}

	static int ask() {
		int yesCounter = 0;
		for (String question : questions) {
			System.out.println(question);
			String input = sc.nextLine();
			if (input.equals("sim") || input.equals("s")) {
				yesCounter++;
			} else if (
					!input.equals("sim") && 
					!input.equals("s")   && 
					!input.equals("nao") && 
					!input.equals("n")
				) {
				System.out.println("Responda sim ou nao! Qualquer resposta diferente ser� considerada como atitude suspeita");
				yesCounter++;
			}
		}
		return yesCounter;
	}
	
	static void judge(int value) {
		System.out.println("Hmmm...");
		if(value==2) {
			System.out.println("Voc� � suspeito(a)!");
		} else if (value>2 && value<5) {
			System.out.println("Voc� � c�mplice!");
		} else if (value==5) {
			System.out.println("Voc� � o(a) assassino(a)!");
		} else {
			System.out.println("Tudo bem, voc� � inocente!");
		}
	}

	public static void main(String[] args) {
		init();
		judge(ask());
	}
}
