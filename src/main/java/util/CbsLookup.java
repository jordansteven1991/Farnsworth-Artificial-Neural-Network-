package util;

public enum CbsLookup {
	TEXAS("Texas", "texas-longhorns");
	
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
