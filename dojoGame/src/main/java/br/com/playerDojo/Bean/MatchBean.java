package br.com.playerDojo.Bean;

import java.util.Date;

import br.com.playerDojo.Entity.Match;

import com.thoughtworks.xstream.XStream;

public class MatchBean {
	
	private Match match = new Match();

	 
	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}
	
	public MatchBean setStartMachDate(Date startDate){
		this.match.setMatchDateStart(startDate);
		return this;
	}
	public MatchBean setEndMachDate(Date endDate){
		this.match.setMatchDateEnd(endDate);
		return this;
	}
	public MatchBean setNumberOfMatch(long numberOfMatch){
		this.match.setMatchNumber(numberOfMatch);
		return this;
	}

	public MatchBean setId(long id){
		match.setId(id);
		return this;
	}
	
	public String toXML() {
		return new XStream().toXML(this);
		
	}


}
