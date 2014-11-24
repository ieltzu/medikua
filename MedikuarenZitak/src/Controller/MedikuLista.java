package Controller;

import java.util.ArrayList;
import java.util.Iterator;

import Model.Medikua;
import Model.Zita;

public class MedikuLista {
	
	private ArrayList<Medikua> medikuLista;
	
	public MedikuLista() {
		this.medikuLista=this.medikuenListaKargatu();
	}
	
	private ArrayList<Medikua> medikuenListaKargatu(){
		return new ArrayList<Medikua>();
	}
	public ArrayList<Medikua> getMedikuLista() {
		return medikuLista;
	}
	private Iterator<Medikua> getIteradorea(){
		return this.getMedikuLista().iterator();
	}
	public Medikua medikuaBilatu(int id) {
		for (Medikua mediku : medikuLista) {
			if(mediku.getiD()== id){
				return mediku;
			}
		}
		return null;
	}
	public Zita getZita(Medikua med, String data){
		Zita zita=med.getZitaData(data);
		return zita;
	}
	public Medikua zitaLibreDuenMedikuaBueltatu(String noiz,int id){
		for (Medikua medi : medikuLista) {
			if (id!=medi.getiD() && medi.zitaLibreDu(noiz)){
				return medi;
			}
		}
		return null;
	}

	public void esleituZitaMedikuBerriari(Medikua medikualibre, Zita zita) {
		medikualibre.zitaEsleitu(zita);
	}

	public void medikuarenZitaKendu(Medikua mediku,Zita zita) {
		mediku.kenduZita(zita);
	}
	
}
