package View;

import java.util.Scanner;

import Controller.Kontroladorea;
import Controller.MedikuLista;
import Model.Gaixoa;
import Model.Medikua;
import Model.Zita;

public class Bista {
	
	private static Scanner sc = new Scanner(System.in);
	public static Bista nireBista =null;
    
	private Bista() {
	}
	public static Bista getBista(){
		if (Bista.nireBista==null){
			Bista.nireBista = new Bista();
		}
		return Bista.nireBista;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Gaixoa ga2 = new Gaixoa("22222222B","Iker","Fernandez","22B");
		Gaixoa ga3 = new Gaixoa("33333333C","Aitor","molinero","33C");
		Gaixoa ga4 = new Gaixoa("44444444D","Bratislaba","djeoso","44D");
		Gaixoa ga1 = new Gaixoa("11111111A","Manuel","Quintana","11A");
		Gaixoa ga5 = new Gaixoa("55555555E","Mikel","de velasco","11A");
		Zita zit1 = new Zita("2014-12-20-11:00",ga1);
		Zita zit2 = new Zita("2014-12-20-11:15",ga2);
		Zita zit3 = new Zita("2014-12-20-11:30",ga3);
		Zita zit4 = new Zita("2014-12-20-11:45",ga4);
		Zita zit5 = new Zita("2014-12-20-11:15",ga5);
		Medikua med1 = new Medikua(111,15,"Paco");
		med1.zitaEsleitu(zit1);
		med1.zitaEsleitu(zit2);
		Medikua med2 = new Medikua(222,15,"Manolo");
		med2.zitaEsleitu(zit3);
		med2.zitaEsleitu(zit4);
		Medikua med3 = new Medikua(333,15,"Juan");
		med3.zitaEsleitu(zit5);
		MedikuLista lis= new MedikuLista();
		Kontroladorea.getKontroladorea().getListaMedikuak().getMedikuLista().add(med1);
		Kontroladorea.getKontroladorea().getListaMedikuak().getMedikuLista().add(med2);
		Kontroladorea.getKontroladorea().getListaMedikuak().getMedikuLista().add(med3);
		
		System.out.println("Sartu zure mediku ID-a");
		int id=sc.nextInt();
		System.out.println("Sartu ezeztatu nahi duzun zita data");
		System.out.println("Urtea:");
		String data=sc.next();
		System.out.println("Hilabetea:");
		data= data.toString()+"-"+sc.next();
		System.out.println("Eguna:");
		data= data.toString()+"-"+sc.next();
		System.out.println("Ordua:");
		data= data.toString()+"-"+sc.next();
		System.out.println("Minutuak:");
		data= data.toString()+":"+sc.next();
		try{
			Kontroladorea.getKontroladorea().medikuarenZitaEzeztatu(id,data);
		}catch(Exception e){
			Bista.getBista().erroreaBistaratu();
		}

		
	}
	private void erroreaBistaratu(){
		System.out.println("Ez dago mediku librerik");
	}
	public void ondoAteraDelaEsan(Medikua medikualibre, Zita zita) {
		Zita zit=medikualibre.getZitaData(zita.getData());
		System.out.println(medikualibre.getIzena()+" medikuari "+zit.getData().toString()+" da gehitu zaion zita data");
		
	}

}
