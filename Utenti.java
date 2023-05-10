public class Utenti {
    private Utente lista[];
    public Utenti(Utente[] lista){
        setLista(lista);
    }
    public Utenti(int dimensione){
       lista=new Utente[dimensione];
    }

    public void setLista(Utente[] lista) {
        int dimensione=lista.length;
        lista=new Utente[dimensione];
        this.lista=lista;
    }
    public void addUtente(int i,String Nome, String Cognome, String Email, String Password){
        lista[i]=new Utente(Nome, Cognome, Email, Password);
    }
   
}
