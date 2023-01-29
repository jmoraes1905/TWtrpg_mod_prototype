package model.entities;

import java.security.InvalidParameterException;

import model.enums.Attribute;

public class Skill {

	private String name;
	private Attribute group;
	private int level;
	private int acumulatedExp;
	private int upgradeRequirement;
	
	public Skill() {
		
	}
	
	public Skill(String name, Attribute group, int level) {
		this.name = name;
		this.group = group;
		this.level = level;
		this.acumulatedExp = 0;
		this.upgradeRequirement = this.level;
	}

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public String getGroup() {
		return group.toString();
	}

	public int getAcumulatedExp() {
		return acumulatedExp;
	}
	
	public int upgradeSkill(int investedExp) {
		if(investedExp < this.upgradeRequirement) {
			throw new InvalidParameterException("Not enough experience for upgrade");
		}
		this.level +=1;
		this.acumulatedExp+= investedExp;
		this.upgradeRequirement+=1;
		return investedExp- this.upgradeRequirement;
	}


	@Override
	public String toString() {
		return getName()+' '+ getLevel() + ' ' + getGroup();
	}
	
}
