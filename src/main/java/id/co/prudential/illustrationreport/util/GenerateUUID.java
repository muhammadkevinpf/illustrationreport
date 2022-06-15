package id.co.prudential.illustrationreport.util;

import java.util.UUID;

public class GenerateUUID {
	
	public static String generateID(){
		UUID id = UUID.randomUUID();
		return id.toString();
	}
	
}
