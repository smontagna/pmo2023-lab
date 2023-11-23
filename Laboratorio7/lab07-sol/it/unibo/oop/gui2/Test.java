package a02a.sol2;

public class Test {

    /*
     * Scopo di questo esercizio è realizzare una GUI con l'aspetto mostrato nell'immagine fig.png, fornita, 
     * che contiene una griglia quadrata di pulsanti inizialmente senza label. Il costruttore di GUI deve prendere in 
     * ingresso il numero di righe (o colonne)---e quindi dovra funzionare per qualunque numero (diciamo fra 3 e 7).
     * Alla pressione di un pulsante la sua label diventi "*", se viene ripremuto torni a " ", e così via.
     * Quando tutte le label su una riga qualsiasi sono "*" o tutte le label su una colonna qualsiasi sono "*" l'applicazione si chiuda.
     * 
     * Sono considerati opzionali ai fini della possibilità di correggere l'esercizio, ma concorrono comunque al raggiungimento 
     * della totalità del punteggio:
     * - scorporamento di tutti gli aspetti che non sono di view in una interfaccia+classe esterna, via Strategy
     * - compilazione e esecuzione dell'esercizio da linea di comando
     * 
     * La classe GUIExample fornita include codice che potrebbe essere utile per la soluzione.
     */

    public static void main(String[] args) throws java.io.IOException {
        // new GUIExample();
        new GUI(4);
    }
}
