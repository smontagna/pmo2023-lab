package a01a.e2;

public class Test {
	
	/*
	 * Scopo di questo esercizio è realizzare una GUI con l'aspetto mostrato nell'immagine gui.png fornita (N=4), attraverso
	 * il completamento della classe GUI fornita (il cui costruttore prenda il numero N dei pulsanti (tranne Print) da
	 * visualizzare. I pulsanti hanno indicazione iniziale 0.
	 * Alla pressione di un pulsante questo passa a 1, poi ripremendolo a 2, poi a 3 e così via. Arrivato a N il
	 * pulsante si disattiva e non può più essere premuto. Premendo Print, si stampi a video una stringa che contenga 
	 * il valore dei pulsanti; nel caso dell'immagine fornita, premendo Print si ottenga ESATTAMENTE la stampa:
	 * 
	 * <<0|2|1|3>>
	 * 
	 * Nel caso in cui dopo una certa pressione tutti i pulsanti abbiano lo stesso valore, si esca senza stampe. 
	 * 
	 * Sono considerati opzionali ai fini della possibilità di correggere l'esercizio, ma concorrono comunque al raggiungimento 
     * della totalità del punteggio:
     * - scorporamento di tutti gli aspetti che non sono di view in una interfaccia+classe esterna, via Strategy
     * - compilazione e esecuzione dell'esempio da linea di comando (a partire dal folder con src/ e bin/)
	 * 
	 * La classe Example (con main) fornisce una GUI con lacune funzionalità probabilmente utili. 
	 */
	
	public static void main(String[] args){
		new GUI(4);
	}

}
