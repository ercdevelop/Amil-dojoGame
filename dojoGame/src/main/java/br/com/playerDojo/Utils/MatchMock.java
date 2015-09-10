package br.com.playerDojo.Utils;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import br.com.playerDojo.Bean.MatchBean;
import br.com.playerDojo.Bean.MatchPlayerBean;
import br.com.playerDojo.Entity.Weapons;

/**
 * 
 * Classe responsável por criar um jogo com um numero de id, Data de Início e Fim
 * Cria vários jogadores que são membros da classe Match
 * Dados mockados
 * @author ercon_000
 *
 */
public class MatchMock {
	
	public static long AWARD = 0;
	
	public static MatchBean populaMatch01(){
		
		MatchBean mb1 =  new MatchBean().setId(1L)
										.setStartMachDate(getDateBegin())
										.setEndMachDate(getDateEnd())
										.setNumberOfMatch(11348965);
		
		return mb1;
	}
	
	public static MatchBean populaMatch02(){
			
			MatchBean mb1 =  new MatchBean().setId(2L)
											.setStartMachDate(getDateBegin())
											.setEndMachDate(getDateEnd())
											.setNumberOfMatch(11348966);
			
			return mb1;
		}
	
	public static MatchBean populaMatch03(){
		
		MatchBean mb1 =  new MatchBean().setId(3L)
										.setStartMachDate(getDateBegin())
										.setEndMachDate(getDateEnd())
										.setNumberOfMatch(11348967);
		
		return mb1;
	}
	
	public static MatchPlayerBean populaDadosPlayers01() throws Exception {
		
		
		Weapons wp101 =  new Weapons(1L,"MG45","heayy","heavyArmor");
		Weapons wp102 =  new Weapons(1L,"Bunker","firegun","heavyArmor");
		Weapons wp103 =  new Weapons(1L,"knife","heayyArmor","heavyArmor");
		Weapons wp104 =  new Weapons(1L,"Missil","heayy","heavyArmor");
		
		
		 
		MatchPlayerBean mpb1 = new MatchPlayerBean().addMatchPlayerWeapon(wp101)
													.addMatchPlayerWeapon(wp102)
													.addMatchPlayerWeapon(wp103)
													.addMatchPlayerWeapon(wp104)
													.setMatchPlayer("Nick")
													.setKillNumber(100)
													.setCasualties(30)
													.setId(1L) ;
		
		if(mpb1.getPlayer().getCasultiesNumber() == 0){
			AWARD = mpb1.getPlayer().getAward();
			AWARD ++;
			mpb1.setAward(AWARD);
		}									
													
	
		return mpb1;
	}
	

	
	
	public static MatchPlayerBean populaDadosPlayers02() throws Exception {
		
		Weapons w2 =  new Weapons(2L,"AK47","assaltWeapon","Assalt");
		Weapons wp203 =  new Weapons(1L,"knife","heayyArmor","heavyArmor");
		Weapons wp204 =  new Weapons(1L,"Missil","heayy","heavyArmor");
		MatchPlayerBean mpb2 = new MatchPlayerBean().addMatchPlayerWeapon(w2)
													.addMatchPlayerWeapon(wp203 )
													.addMatchPlayerWeapon(wp204)
													.setMatchPlayer("Roman")
													.setKillNumber(80)
													.setCasualties(25)
													.setId(2L);
		if(mpb2.getPlayer().getCasultiesNumber() == 0){
			AWARD = mpb2.getPlayer().getAward();
			AWARD ++;
			mpb2.setAward(AWARD);
		}
		return mpb2;
	}
	
	public static MatchPlayerBean populaDadosPlayers03() throws Exception {
			
			Weapons w2 =  new Weapons(2L,"AK47","assaltWeapon","Assalt");
			Weapons wp101 =  new Weapons(1L,"MG45","heayy","heavyArmor");
			MatchPlayerBean mpb3 = new MatchPlayerBean().addMatchPlayerWeapon(w2)
														.addMatchPlayerWeapon(wp101)
														.setMatchPlayer("Eduardo")
														.setKillNumber(80)
														.setCasualties(0)
														.setId(3L);
			if(mpb3.getPlayer().getCasultiesNumber() == 0){
				AWARD = mpb3.getPlayer().getAward();
				AWARD ++;
				mpb3.setAward(AWARD);
			}
			return mpb3;
		}
	
	public static MatchPlayerBean populaDadosPlayers04() throws Exception {
		
		Weapons w4 =  new Weapons(2L,"AK47","assaltWeapon","Assalt");
		Weapons wp101 =  new Weapons(1L,"MG45","heayy","heavyArmor");
		MatchPlayerBean mpb4 = new MatchPlayerBean().addMatchPlayerWeapon(w4)
													.addMatchPlayerWeapon(wp101)
													.setMatchPlayer("Ricardo")
													.setKillNumber(120)
													.setCasualties(10)
													.setId(4L);
		
		
		if(mpb4.getPlayer().getCasultiesNumber() == 0){
			AWARD = mpb4.getPlayer().getAward();
			AWARD ++;
			mpb4.setAward(AWARD);
		}
		
		return mpb4;
	}
	

	
	public static Date getDateBegin() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2013); 
		c.set(Calendar.MONTH, Calendar.APRIL); 
		c.set(Calendar.DAY_OF_MONTH, 23);
		c.set(Calendar.HOUR, 3);
		c.set(Calendar.MINUTE, 34);
		c.set(Calendar.SECOND, 22);
		Date dateBegin = c.getTime();
		return dateBegin;
	}
	
	public static Date getDateEnd() {
		Calendar c = Calendar.getInstance();
		
		
		c.set(Calendar.YEAR, 2013); 
		c.set(Calendar.MONTH, Calendar.APRIL); 
		c.set(Calendar.DAY_OF_MONTH, 23);
		c.set(Calendar.HOUR, 3);
		c.set(Calendar.MINUTE, 39);
		c.set(Calendar.SECOND, 22);
		
		Date dateEnd = c.getTime();
		
		Locale brasil = new Locale("pt", "BR");
		DateFormat format = DateFormat.getDateInstance(DateFormat.FULL, brasil);
		
		format.format(dateEnd);
		
		return dateEnd;
	}

}
