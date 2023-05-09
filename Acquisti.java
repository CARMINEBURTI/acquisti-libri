public class Acquista {
    private Acquisto[] lista;
    
    public Acquista() {
        lista = new Acquisto[0];
    }
    
    public Acquisto[] getLista() {
        return lista;
    }
    
    public void setLista(Acquisto[] lista) {
        this.lista = lista;
    }
    
    public void aggiungiAcquisto(Acquisto acquisto) {
        Acquisto[] nuovaLista = new Acquisto[lista.l + 1];
        for (int i = 0; i < lista.l; i++) {
            nuovaLista[i] = lista[i];
        }
        nuovaLista[lista.l] = acquisto;
        lista = nuovaLista;
    }
}
