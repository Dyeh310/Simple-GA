package ga.individual;

import java.util.Arrays;

public class Chromosome {

	private int[] genes;
	private final int GENE_LENGTH = 50;

	//select size of Chromosome.
	public Chromosome() {
		this.genes = new int[GENE_LENGTH];

	}

	//new Chromosome is created in binary
	public void createChromosome() {
		for (int i = 0; i < genes.length; i++) {
			genes[i] += Math.round(Math.random());
		}
	
	}
	
	//Can access genes across classes now
	public int[] getGenes() {
		return this.genes;
	}
	
	//Prints Chromosome
	public String toString() {
		String str = Arrays.toString(getGenes());
		return str;
	}
	

}
