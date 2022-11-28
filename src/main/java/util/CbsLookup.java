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
	BAMA("Alabama", "alabama-crimson-tide"),
	DUKE("Duke", "duke-blue-devils"),
	CREIGH("Creighton", "creighton-bluejays"),
	AUBURN("Auburn", "auburn-tigers"),
	KANSAS("Kansas", "kansas-jayhawks"),
	SDGST("San Diego St.", "san-diego-state-aztecs"),
	OHIOST("Ohio St.","ohio-state-buckeyes"),
	UNC("North Carolina", "north-carolina-tar-heels"),
	IOWA("Iowa", "iowa-hawkeyes"),
	ILL("Illinois", "illinois-fighting-illini"),
	MARYCA("Saint Mary's", "saint-marys-gaels"),
	MD("Maryland", "maryland-terrapins"),
	MICHST("Michigan St.", "michigan-state-spartans"),
	TXTECH("Texas Tech", "texas-tech-red-raiders"),
	MEMP("Memphis", "memphis-tigers"),
	MISSST("Mississippi St.", "mississippi-state-bulldogs"),
	OKLA("Oklahoma", "oklahoma-sooners"),
	XAVIER("Xavier", "xavier-musketeers"),
	PSU("Penn St.", "penn-state-nittany-lions"),
	VATECH("Virginia Tech", "virginia-tech-hokies"),
	RUT("Rutgers", "rutgers-scarlet-knights"),
	OKLAST("Oklahoma St.", "oklahoma-state-cowboys"),
	MIZZOU("Missouri", "missouri-tigers"),
	WVU("West Virginia", "west-virginia-mountaineers");
	
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
