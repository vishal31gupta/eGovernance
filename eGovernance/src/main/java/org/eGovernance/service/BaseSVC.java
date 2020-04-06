package org.eGovernance.service;

public interface BaseSVC {

	public boolean sendMail(String mailId, String sub, String text);
	public String getRandomString(int length);
	
}
