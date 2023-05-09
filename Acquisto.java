public class Acquisto {
    private String utente;
    private String lista;
    private int data;
    
    public Acquisto(String utente, String lista, int data) {
        setUtente(utente);
        setLista(lista);
        setData(data);
    }
    
    public Acquisto(Acquisto a) {
        setUtente(a.getUtente());
        setLista(a.getLista());
        setData(a.getData());
    }
    
    public void setData(int data) {
        this.data = data;
    }
    
    public void setUtente(String utente) {
        this.utente = utente;
    }
    
    public void setLista(String lista) {
        this.lista = lista;
    }
    
    public int getData() {
        return data;
    }
    
    public String getUtente() {
        return utente;
    }
    
    public String getLista() {
        return lista;
    }
}
