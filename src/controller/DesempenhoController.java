package controller;

public class DesempenhoController {

	public DesempenhoController() {
		super();
	}
	public void vetmil() {
		int vet[] = new int [1000];
		int i;
		double tempoinicial = System.nanoTime();
		for (i = 0; i<1000; i++) {
			vet[i] = 0;
		}
		double tempofinal = System.nanoTime();
		double tempototal = tempofinal-tempoinicial;
		tempototal = tempototal / Math.pow(10, 9);
		System.out.println("tempo para vetor de mil posições: "+tempototal+ "seg");
	}
	public void vetdezmil() {
		int vet[] = new int [10000];
		int i;
		double tempoinicial = System.nanoTime();
		for (i = 0; i<10000; i++) {
			vet[i] = 0;
		}
		double tempofinal = System.nanoTime();
		double tempototal = tempofinal-tempoinicial;
		tempototal = tempototal / Math.pow(10, 9);
		System.out.println("tempo para vetor de 10 mil posições: "+tempototal+ "seg");
}
	public void vetcemmil() {
		int vet[] = new int [100000];
		int i;
		double tempoinicial = System.nanoTime();
		for (i = 0; i<100000; i++) {
			vet[i] = 0;
		}
		double tempofinal = System.nanoTime();
		double tempototal = tempofinal-tempoinicial;
		tempototal = tempototal / Math.pow(10, 9);
		System.out.println("tempo para vetor de 100 mil posições: "+tempototal+ "seg");
}
}
