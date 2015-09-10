package br.com.playerDojo;

import java.util.Collections;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import br.com.playerDojo.Bean.MatchBean;
import br.com.playerDojo.DAO.MatchDAO;
import br.com.playerDojo.Entity.MatchPlayer;

public class ClientTestGame {
	
	@Test
	public void testMatchNumber01(){
		MatchBean  matchBean = new MatchDAO().busca(1L);
		Assert.assertEquals(11348965, matchBean.getMatch().getMatchNumber());
		
	}
	
	@Test
	public void testMatchNumber02(){
		MatchBean  matchBean = new MatchDAO().busca(2L);
		Assert.assertEquals(11348966, matchBean.getMatch().getMatchNumber());
		
	}
	
	@Test
	public void testMatchNumber03(){
		MatchBean  matchBean = new MatchDAO().busca(3L);
		Assert.assertEquals(11348967, matchBean.getMatch().getMatchNumber());
		
	}
	
	@Test
	public void testMatchWinnerByMatchNumber01(){
		MatchBean  matchBean = new MatchDAO().busca(1L);
		List<MatchPlayer> sortPlayerListByKill = matchBean.getMatch().getMatchlist();
		Collections.sort(sortPlayerListByKill );
		String nickNameByWinner = sortPlayerListByKill.get(sortPlayerListByKill.size()-1).getPlayerNickName();
		Assert.assertEquals("Nick", nickNameByWinner);
		
		
	}
	
	@Test
	public void testMatchWinnerByMatchNumber02(){
		MatchBean  matchBean = new MatchDAO().busca(2L);
		List<MatchPlayer> sortPlayerListByKill = matchBean.getMatch().getMatchlist();
		Collections.sort(sortPlayerListByKill );
		String nickNameByWinner = sortPlayerListByKill.get(sortPlayerListByKill.size()-1).getPlayerNickName();
		Assert.assertEquals("Nick", nickNameByWinner);
			
	}
	
	@Test
	public void testMatchWinnerByMatchNumber03(){
		MatchBean  matchBean = new MatchDAO().busca(3L);
		List<MatchPlayer> sortPlayerListByKill = matchBean.getMatch().getMatchlist();
		Collections.sort(sortPlayerListByKill );
		String nickNameByWinner = sortPlayerListByKill.get(sortPlayerListByKill.size()-1).getPlayerNickName();
		Assert.assertEquals("Ricardo", nickNameByWinner);
		
	}
	
	 
	
	

}
