package util;

public enum CbsLookup {
	SAMHOU("sam houston st", "/college-basketball/teams/SAMHOU/sam-houston-bearkats/"),
	UCSB("uc santa barbara", "/college-basketball/teams/UCSB/santa-barbara-gauchos/"),
	MTSB("middle tennessee", "/college-basketball/teams/MTSU/middle-tenn-blue-raiders/"),
	CALBPTST("cal baptist", "/college-basketball/teams/CALBPTST/california-baptist-lancers/"),
	NCGRN("unc greensboro", "/college-basketball/teams/NCGRN/uncg-spartans/"),
	NCWILM("unc wilmington", "/college-basketball/teams/NCWILM/uncwilmington-seahawks/"),
	UCRIV("uc riverside", "/college-basketball/teams/UCRIV/california-riverside-highlanders/"),
	UTEP("utep", "/college-basketball/teams/UTEP/texasel-paso-miners/"),
	TXAMCC("texas a&amp;m corpus chris", "/college-basketball/teams/TXAMCC/texas-amcorpus-christi-islanders/"),
	NCASHV("unc asheville", "/college-basketball/teams/NCASHV/uncasheville-bulldogs/"),
	IPFW("purdue fort wayne", "/college-basketball/teams/IPFW/pfw-mastodons/"),
	GWEBB("gardner webb", "/college-basketball/teams/GWEBB/gardnerwebb-bulldogs/");
	
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
