package fr.mds.bruz.tp11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.mds.bruz.tp11.Utils.Conjugateur;

public class tp11 {
	
	private final static String[] VERBES = {"manger", "marcher", "lever"};
	
	public static void main(String[] args) {
		List verbes = new ArrayList();
		
		for(String verbe : VERBES) {
			verbes.add(verbe);			
		}

		Conjugateur cj = new Conjugateur(verbes);
		
		cj.conjugation();
		
		String nvVerbe = "";
		Scanner sc = new Scanner(System.in);

		boolean addVerbe = true;
		do {
			System.out.println("Saissir un verbe : ");
			nvVerbe = sc.nextLine();
			if (!verbes.contains(nvVerbe)) {
				addVerbe = false;
			}
		} while(addVerbe);
		
		cj.conjugation(nvVerbe);
		sc.close();
	}
}
