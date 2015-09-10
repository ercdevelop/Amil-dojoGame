package br.com.playerDojo.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Match {
	
	private long id;
	private long matchNumber;
	private Date matchDateStart;
	private Date matchDateEnd;
	private List<MatchPlayer> matchlist = new ArrayList<MatchPlayer>();
	
	public Date getMatchDateStart() {
		return matchDateStart;
	}
	public void setMatchDateStart(Date matchDateStart) {
		this.matchDateStart = matchDateStart;
	}
	public Date getMatchDateEnd() {
		return matchDateEnd;
	}
	public void setMatchDateEnd(Date matchDateEnd) {
		this.matchDateEnd = matchDateEnd;
	}
	public long getMatchNumber() {
		return matchNumber;
	}
	public void setMatchNumber(long matchNumber) {
		this.matchNumber = matchNumber;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<MatchPlayer> getMatchlist() {
		return matchlist;
	}
	public void setMatchlist(List<MatchPlayer> matchlist) {
		this.matchlist = matchlist;
	}
	
	

}
