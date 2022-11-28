package util;

public enum CbsLookup {
	TEXAS("Texas", "texas-longhorns"),
	HOU("Houston", "houston-cougars"),
	TENN("Tennessee", "tennessee-volunteers"),
	UK("Kentucky", "kentucky-wildcats"),
	UVA("Virginia", "virginia-cavaliers"),
	BAYLOR("Baylor", "baylor-bears"),
	GONZAG("Gonzaga", "gonzaga-bulldogs"),
	UCONN("Connecticut", "connecticut-huskies"),
	ARIZ("Arizona", "arizona-wildcats"),
	IND("Indiana", "indiana-hoosiers"),
	UCLA("UCLA", "ucla-bruins"),
	ARK("Arkansas", "arkansas-razorbacks"),
	PURDUE("Purdue", "purdue-boilermakers"),
	BAMA("Alabama", "alabama-crimson-tide");
	
	private final String key;
    private final String value;
	
	CbsLookup(String key, String value) {
		this.key = key;
		this.value = value;
	}
	
	public String getKey() {
		return key;
	}
	
	public String getValue() {
		return value;
	}
}
