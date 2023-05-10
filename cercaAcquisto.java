public int cerca(Acquisto a) {
    int x = -1;
    for (int i = 0; i < lista.length; i++) {
        if (a.getUtente().equals(lista[i].getUtente()) && a.getLista().equals(lista[i].getLista()) && a.getData()==lista[i].getData()) {
            x = i;
            break;
        }
    }
    return x;
}
