package br.com.playerDojo.Entity;

public class Weapons {
	
	private long id;
	private String weaponName;
	private String category;
	private String description;
	
	public Weapons(){
		
	}
	
	public Weapons(long id,String weaponName, String category, String description){
		
		this.id = id;
		this.weaponName = weaponName;
		this.category = category;
		this.description = description;
		
	}
	
	
	public String getWeaponName() {
		return weaponName;
	}
	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	

}
