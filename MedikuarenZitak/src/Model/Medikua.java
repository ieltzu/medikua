package Model;

import java.util.ArrayList;

public class Medikua {
	
	private String izena;
	private int iD;
	private int maxGaixo;
	private ArrayList<Zita> zitak;
	
	public Medikua(int pid, int pmax, String iz) {
		this.iD=pid;
		this.maxGaixo=pmax;
		this.izena=iz;
		this.zitak= new ArrayList<Zita>();
	}
	public ArrayList<Zita> getZitak() {
		return this.zitak;
	}
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public int getMaxGaixo() {
		return maxGaixo;
	}
	public void setMaxGaixo(int maxGaixo) {
		this.maxGaixo = maxGaixo;
	}
	public Zita getZitaData(String pdata){
		for (Zita zita : zitak) {
			if(zita.getData().equals(pdata)){
				return zita;
			}
		}
		return null;
	}
	public boolean zitaLibreDu(String noiz) {
		for (Zita zita : zitak) {
			if(zita.getData().equals(noiz)){
				return false;
			}
		}
		return true;
	}
	public void zitaEsleitu(Zita zita){
		this.getZitak().add(zita);
	}
	public void kenduZita(Zita zita){
		this.getZitak().remove(zita);
	}
	
}