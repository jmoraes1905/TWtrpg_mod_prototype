package application;

import model.entities.Character;

public class Program {

	public static void main(String[] args) {
		
		String personName = "Legolas";
		String personSpecies = "Elf";
		Character person = new Character(personName, personSpecies);
		
		System.out.println(person);
		System.out.println(person.getSkillList());		
	}

}
