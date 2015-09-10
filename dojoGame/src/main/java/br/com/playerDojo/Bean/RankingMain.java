package br.com.playerDojo.Bean;

import java.util.Collections;
import java.util.List;

import br.com.playerDojo.DAO.MatchDAO;
import br.com.playerDojo.Entity.MatchPlayer;


/**
 * Classe responsável por exibir o Ranking dos jogadores
 * @author ercon_000
 *
 */
public class RankingMain {
	
	
  
	public static void main(String[] args) {
		/* busca pelo ID do jogo - no caso foram criadas 3 partidas no MatchMock*/
		MatchBean  matchBean = new MatchDAO().busca(1L);
		
		long matchNumber = matchBean.getMatch().getMatchNumber();
		
		List<MatchPlayer> sortPlayerListByKill = matchBean.getMatch().getMatchlist();
		Collections.sort(sortPlayerListByKill );
		
		for (MatchPlayer player : sortPlayerListByKill) {
			
			 System.out.println("=================================================");
			 System.out.println("Player ID: "+player.getId());
			 System.out.println("Player NICKNAME: "+player.getPlayerNickName()); 
			 System.out.println("Player TOTAL KILL: "+player.getKillNumber());
			 System.out.println("Player TOTAL CASUALTIES: "+player.getCasultiesNumber());
			 System.out.println("Player TOTAL AWARDS: "+player.getAward());
			 
			 
		}
		System.out.println("=================================================");
		System.out.println("Total number of Players on Game "+matchNumber+": "+matchBean.getMatch().getMatchlist().size());
		
		String betPlayerOfMatch = sortPlayerListByKill.get(sortPlayerListByKill.size()-1).getPlayerNickName();
		long totalKillBestPlayer = sortPlayerListByKill.get(sortPlayerListByKill.size()-1).getKillNumber();
		
		System.out.println("The Match's Winner "+ betPlayerOfMatch);
		System.out.println("Total Kill "+ totalKillBestPlayer);
		
		
		
		
		
		
	}
	

}
