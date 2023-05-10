public int cerca(Utente utente) {
        int x = -1;
        for (int i = 0; i < lista.length; i++) {
            Utente listaUtente = lista[i];
            if (utente.getNome().equals(listaUtente.getNome()) && utente.getCognome().equals(listaUtente.getCognome()) && utente.getEmail().equals(listaUtente.getEmail()) && utente.getPassword().equals(listaUtente.getPassword())) {
                x = i;
                break;
            }
        }
        return x;
    }