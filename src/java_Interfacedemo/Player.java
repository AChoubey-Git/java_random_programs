package java_Interfacedemo;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

	private String name;
	private int hitpoint;
	private int strength;
	private String Weapon;
	
	Player(String name,int hitpoint,int strength){
		
		this.name=name;
		this.hitpoint=hitpoint;
		this.strength=strength;
		this.Weapon="Katana";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHitpoint() {
		return hitpoint;
	}

	public void setHitpoint(int hitpoint) {
		this.hitpoint = hitpoint;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public String getWeapon() {
		return Weapon;
	}

	public void setWeapon(String weapon) {
		Weapon = weapon;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", hitpoint=" + hitpoint + ", strength=" + strength + ", Weapon=" + Weapon
				+ "]";
	}

	@Override
	public List<String> write() {
		List<String> values =new ArrayList<String>(); 
		values.add(0, this.name);
		values.add(1,""+this.hitpoint);
		values.add(2,""+this.strength);
		values.add(3, this.Weapon);
		return values;
	}

	@Override
	public void read(List<String> savedvlues) {
		if(savedvlues!=null && savedvlues.size()>0) {
			this.name=savedvlues.get(0);
			this.hitpoint=Integer.parseInt(savedvlues.get(1));
			this.strength=Integer.parseInt(savedvlues.get(2));
			this.Weapon=savedvlues.get(3);
		}
		
	}

	
}
