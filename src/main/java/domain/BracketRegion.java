package domain;

import java.util.List;

public class BracketRegion {
	
	private Team winner;
	private List<Team> allWinners;
	private boolean firstRoundUpsets;
	
	
	public Team getWinner() {
		return winner;
	}
	public void setWinner(Team winner) {
		this.winner = winner;
	}
	public List<Team> getAllWinners() {
		return allWinners;
	}
	public void setAllWinners(List<Team> allWinners) {
		this.allWinners = allWinners;
	}
	public boolean isFirstRoundUpsets() {
		return firstRoundUpsets;
	}
	public void setFirstRoundUpsets(boolean firstRoundUpsets) {
		this.firstRoundUpsets = firstRoundUpsets;
	}

}
