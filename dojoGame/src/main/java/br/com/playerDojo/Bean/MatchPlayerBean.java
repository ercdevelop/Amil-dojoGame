package br.com.playerDojo.Bean;

import br.com.playerDojo.Entity.MatchPlayer;
import br.com.playerDojo.Entity.Weapons;


/**
 * Classe que armazena a regra de negócio dos Players
 * @author ercon_000
 *
 */
public class MatchPlayerBean {
	
	private MatchPlayer player = new MatchPlayer();
	
	 
	/**
	 * Permitir no máximo 4 armas por Players
	 * @param weapons
	 * @return
	 * @throws Exception
	 */
	public MatchPlayerBean addMatchPlayerWeapon (Weapons weapons) throws Exception{
		if(player.getWeaponList().size() > 4 ){
			throw new Exception();
		}else {
			
			player.getWeaponList().add(weapons);
		}
		return this;
	}
	
 
	public MatchPlayerBean setId(long id){
		this.player.setId(id);
		return this;
	}
	
	public MatchPlayerBean setMatchPlayer( String nickName){
		this.player.setPlayerNickName(nickName);
		return this;
	}
	
	public MatchPlayerBean setKillNumber( long killNumber){
		this.player.setKillNumber(killNumber);
		return this;
	}
	
	public MatchPlayerBean setCasualties( long casulaties){
		this.player.setCasultiesNumber(casulaties);
		return this;
	}
	
	public MatchPlayerBean setAward( long award){
		this.player.setAward(award);
		return this;
	}
	
	

	public MatchPlayer getPlayer() {
		return player;
	}
	
	

	public void setPlayer(MatchPlayer player) {
		this.player = player;
	}


}
