public Acquisto cerca(Acquisto a){
int x=-1;
	for(int i=0;i<lista.length;i++){
		if(a.getTitolo().equals(lista[i].getTitolo()) &&  a.getAutore().equals(lista[i].getAutore()) && a.getCodice()==lista[i].getCodice()) && a.getPrezzo()==lista[i].getPrezzo()){
			x=i;
		}
	}
return x;
}