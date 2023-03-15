package domain;

public class MarchMadness {

	private FinalFour finalFour;
	private BracketRegion west;
	private BracketRegion east;
	private BracketRegion south;
	private BracketRegion midwest;
	private Team winner;
	
	public MarchMadness(BracketRegion west, BracketRegion east, BracketRegion south, BracketRegion midwest, FinalFour finalFour) {
		this.west = west;
		this.east = east;
		this.south = south;
		this.midwest = midwest;
		this.finalFour = finalFour;
	}

	public FinalFour getFinalFour() {
		return finalFour;
	}

	public void setFinalFour(FinalFour finalFour) {
		this.finalFour = finalFour;
	}

	public BracketRegion getWest() {
		return west;
	}

	public void setWest(BracketRegion west) {
		this.west = west;
	}

	public BracketRegion getEast() {
		return east;
	}

	public void setEast(BracketRegion east) {
		this.east = east;
	}

	public BracketRegion getSouth() {
		return south;
	}

	public void setSouth(BracketRegion south) {
		this.south = south;
	}

	public BracketRegion getMidwest() {
		return midwest;
	}

	public void setMidwest(BracketRegion midwest) {
		this.midwest = midwest;
	}

	public Team getWinner() {
		return winner;
	}

	public void setWinner(Team winner) {
		this.winner = winner;
	}

	public boolean isFinalFourAllOneSeeds() {
		return finalFour.isFinalFourAllOneSeeds();
	}

	public boolean isFirstRoundUpsets() {
		return (west.isFirstRoundUpsets() || east.isFirstRoundUpsets() || south.isFirstRoundUpsets()
				|| midwest.isFirstRoundUpsets()) ? true : false;
	}
	
	public boolean isWinnerUnlikely() {
		return (winner.getSeed() > 5) ? true : false;
	}
	
	public boolean isValid() {
		return (isFirstRoundUpsets() && !isFinalFourAllOneSeeds() && !isWinnerUnlikely()) ? true : false;
	}

}
