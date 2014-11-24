package Model;

import java.util.Date;

public class Zita {
	
	private String data;
	private Gaixoa gaixoa;
	
	
	
	public Zita(String pData,Gaixoa ga) {
		this.data=pData;
		this.gaixoa=ga;
	}
	public String getData() {
		return data;
	}
	public Gaixoa getGaixoa() {
		return gaixoa;
	}
}
