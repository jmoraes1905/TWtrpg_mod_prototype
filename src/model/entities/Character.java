package model.entities;

import java.util.ArrayList;
import java.util.List;

import model.enums.Attribute;


public class Character {
	
	private String name;
	private String species;
	
	private List<Skill> skillList = new ArrayList<>();
	private int totalExp;
	private int availableExp;

	
	public Character() {
		
	}
	
	
	
	
	public Character(String name, String species) {
		super();
		this.name = name;
		this.species = species;
		this.totalExp = 0;
		this.availableExp = 0;
		this.basicSkillSetup();
	}


	public List<Skill> getSkillList() {
		return skillList;
	}


	public int getTotalExp() {
		return totalExp;
	}


	public int getAvailableExp() {
		return availableExp;
	}
	
	public String getName() {
		return name;
	}


	public String getSpecies() {
		return species;
	}


	private void basicSkillSetup() {
		Skill archery = new Skill("archery", Attribute.REF, availableExp);
		this.skillList.add(archery);
	}
	
	@Override
	public String toString() {
		return this.getName()+ ' ' +this.getSpecies();
	}
	
	

}
