package fr.mds.bruz.tp11.Utils;

import java.util.List;

public class Conjugateur {

	private final static String[] PRONOM = { "je", "tu", "il / elle", "nous", "vous", "ils / elles" };
	private final static String[] TERMINAISON = { "e", "es", "e", "ons", "ez", "ent" };

	public List verbes;

	public Conjugateur(List verbes) {
		this.verbes = verbes;
	}

	public void conjugation() {
		String output = "";
		for (int i = 0; i < this.verbes.size(); i++) {
			System.out.println("Conjugaison au present de l'indicatif du verbe " + this.verbes.get(i).toString());
			int index = 0;
			for (String p : PRONOM) {
				output = p + ' ' + splitter(this.verbes.get(i).toString()) + TERMINAISON[index++];
				System.out.println(output);
			}
			System.out.println("");
		}
	}

	public void conjugation(String verbe) {
		String output = "";
		System.out.println("Conjugaison au present de l'indicatif du verbe " + verbe);
		int index = 0;
		for (String p : PRONOM) {
			output = p + ' ' + splitter(verbe) + TERMINAISON[index++];
			System.out.println(output);
		}
		System.out.println("");
	}

	private final static String splitter(String verbe) {
		return verbe.substring(0, verbe.length() - 2);
	}
}
