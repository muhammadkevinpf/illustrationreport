package id.co.prudential.illustrationreport.util;

public enum RoleUtil {
	PH("OW"), LA("LA"), PAYOR("PY"), TOPUP("PT"), BENEF("BN");

	private String code;

	RoleUtil(String code) {
		this.code = code;
	}

	public String code() {
		return code;
	}
}