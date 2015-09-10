package br.com.playerDojo.Entity;

import java.util.ArrayList;
import java.util.List;


public class MatchPlayer implements Comparable<MatchPlayer> {
	
	private long id;
	private long casultiesNumber;
	private long killNumber;
	private long award;
	private String playerNickName;
	private List<Weapons> weaponList =  new ArrayList<Weapons>();
	
	public MatchPlayer(long id ,String nickName){
		this.id = id;
		this.playerNickName = nickName;
		
	}

	
	public long getCasultiesNumber() {
		return casultiesNumber;
	}

	public void setCasultiesNumber(long casultiesNumber) {
		this.casultiesNumber = casultiesNumber;
	}

	public long getKillNumber() {
		return killNumber;
	}

	public void setKillNumber(long killNumber) {
		this.killNumber = killNumber;
	}

	public long getAward() {
		return award;
	}

	public void setAward(long award) {
		this.award = award;
	}
	
	public MatchPlayer(){
		
	}
	 public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPlayerNickName() {
		return playerNickName;
	}
	public void setPlayerNickName(String playerNickName) {
		this.playerNickName = playerNickName;
	}
	public List<Weapons> getWeaponList() {
		return weaponList;
	}
	public void setWeaponList(List<Weapons> weaponList) {
		this.weaponList = weaponList;
	}


	@Override
	public int compareTo(MatchPlayer o) {
		if(this.killNumber < o.killNumber){
			return -1;
		}
		if(this.killNumber > o.killNumber){
			return 1;
		}
		return 0;
	}
	
	

}
