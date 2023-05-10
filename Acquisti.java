public class Acquisti {
    private Acquisto[] lista;
    
    public Acquisti(int dimensioneIniziale) {
        lista = new Acquisto[dimensioneIniziale];
    }
    
    public Acquisto[] getLista() {
        return lista;
    }
    
    public void setLista(Acquisto[] lista) {
        this.lista = lista;
    }
    
    public void aggiungiAcquisto(Acquisto acquisto) {
        Acquisto[] nuovaLista = new Acquisto[lista.length + 1];
        for (int i = 0; i < lista.length; i++) {
            nuovaLista[i] = lista[i];
        }
        nuovaLista[lista.length] = acquisto;
        lista = nuovaLista;
    }
}
