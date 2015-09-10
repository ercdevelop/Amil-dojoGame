package br.com.playerDojo.DAO;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import br.com.playerDojo.Bean.MatchBean;
import br.com.playerDojo.Bean.MatchPlayerBean;
import br.com.playerDojo.Utils.MatchMock;

/**
 * 
 * @author ercon_000
 * Classe que simula as informações que serão persistidas no banco. 
 * um bloco estático carrega todos os atributos mockados
 * 
 *
 */
public class MatchDAO {
	
	private static Map<Long, MatchBean> banco = new HashMap<Long, MatchBean>();
	private static AtomicLong contador = new AtomicLong(1);
	
	static {
		
		try {
			/*Carregando os jogadores */
			MatchPlayerBean mpb1 = MatchMock.populaDadosPlayers01();
			MatchPlayerBean mpb2 = MatchMock.populaDadosPlayers02();
			MatchPlayerBean mpb3 = MatchMock.populaDadosPlayers03();
			MatchPlayerBean mpb4 = MatchMock.populaDadosPlayers04();

			
			/*Carregando a partida 1 e add jogadores*/
			MatchBean match1 = MatchMock.populaMatch01();
			match1.getMatch().getMatchlist().add(mpb1.getPlayer());
			match1.getMatch().getMatchlist().add(mpb2.getPlayer());
			match1.getMatch().getMatchlist().add(mpb3.getPlayer());
			
			/*Carregando a partida 2 e add jogadores*/
			MatchBean match2 = MatchMock.populaMatch02();
			match2.getMatch().getMatchlist().add(mpb1.getPlayer());
			match2.getMatch().getMatchlist().add(mpb2.getPlayer());
			
			/*Carregando a partida 3 e add jogadores */
			MatchBean match3 = MatchMock.populaMatch03();
			match3.getMatch().getMatchlist().add(mpb1.getPlayer());
			match3.getMatch().getMatchlist().add(mpb2.getPlayer());
			match3.getMatch().getMatchlist().add(mpb3.getPlayer());
			match3.getMatch().getMatchlist().add(mpb4.getPlayer());
			
			
			/* persistindo no banco*/
			banco.put(1L, match1);
			banco.put(2L, match2);
			banco.put(3L, match3);

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	 }


	
	public void adiciona(MatchBean bean) {
		long id = contador.incrementAndGet();
		bean.setId(id);
		banco.put(id, bean);
	}
	
	public MatchBean busca(Long id) {
		return banco.get(id);
	}
	
	


	
	
	
	


}
