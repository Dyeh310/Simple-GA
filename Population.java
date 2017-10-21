package ga.population;

import java.util.Arrays;

import ga.individual.Chromosome;

public class Population {

	private Chromosome[] chromosomes;
	private Chromosome chromosome;

	// Sets the number of chromosomes created in the population
	public Population(int size) {
		this.chromosomes = new Chromosome[size];
	}

	// Creates a population with chromosomes made up of genes
	public Chromosome[] Populate() {
		for (int i = 0; i < this.chromosomes.length; i++) {
			chromosome = new Chromosome();
			chromosome.createChromosome();
			this.chromosomes[i] = chromosome;

		}
		return this.chromosomes;

	}

	//Prints the population samples
	public String toString() {
		String str = "";
		int count = 0;

		for (Chromosome c : chromosomes) {
			count++;
			str += "Population Sample : " + count + " " + c + "\n";
		}

		return str;
	}

}
