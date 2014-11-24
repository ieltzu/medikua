package Controller;

import Model.Medikua;
import Model.Zita;
import View.Bista;

public class Kontroladorea {
		public static Kontroladorea nireKontroladorea =null;
	    private static MedikuLista listaMedikuak;
	    
		private Kontroladorea() {
		}
		public static Kontroladorea getKontroladorea(){
			if (Kontroladorea.nireKontroladorea==null){
				Kontroladorea.nireKontroladorea = new Kontroladorea();
				listaMedikuak= new MedikuLista();
			}
			return Kontroladorea.nireKontroladorea;
		}
		public static MedikuLista getListaMedikuak() {
			return listaMedikuak;
		}
		public void medikuarenZitaEzeztatu(int id, String data) throws Exception{
			Medikua medikua=this.getListaMedikuak().medikuaBilatu(id);
			Zita zita=this.getListaMedikuak().getZita(medikua,data);
			Medikua medikualibre=this.getListaMedikuak().zitaLibreDuenMedikuaBueltatu(data, id);
			if(medikualibre != null){
				this.getListaMedikuak().esleituZitaMedikuBerriari(medikualibre, zita);
				Bista.getBista().ondoAteraDelaEsan(medikualibre,zita);
			}else{
				throw new Exception();
			}
			this.getListaMedikuak().medikuarenZitaKendu(medikua,zita);
		}
}
