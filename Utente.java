public class Utente {
    private String nome;
    private String cognome;
    private String email;
    private String password;
   
    public Utente(String nome, String cognome, String email, String password){
         setNome(nome);
         setCognome(cognome);
         setEmail(email);
         setPassword(password);
    }
    public void setNome (String nome){
    this.nome=nome;
    }
    public String getNome(){
         return nome;
     }
    public void setCognome (String cognome){
    this.cognome=cognome;
    }
    public String getCognome(){
         return cognome;
    }
    public void setEmail (String email){
    this.email=email;
    }
    public String getEmail(){
         return email;
   
    }
    public void setPassword (String password){
    this.password=password;
    }
    public String getPassword(){
         return password;
    }
}
