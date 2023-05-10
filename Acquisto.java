import java.time.LocalDateTime;

public class Acquisto {
    private Utente utente;
    private Libro[] lista;
    private LocalDateTime data;
    
    public Acquisto(Utente utente, Libro[] lista, LocalDateTime data) {
        setUtente(utente);
        setLista(lista);
        setData(data);
    }
    
    public Acquisto(Acquisto a) {
        setUtente(a.getUtente());
        setLista(a.getLista());
        setData(a.getData());
    }
    
    public void setData(LocalDateTime data) {
        this.data = data;
    }
    
    public void setUtente(Utente utente) {
        this.utente = utente;
    }
    
    public void setLista(Libro[] lista) {
        this.lista = lista;
    }
    
    public LocalDateTime getData() {
        return data;
    }
    
    public Utente getUtente() {
        return utente;
    }
    
    public Libro[] getLista() {
        return lista;
    }
}
