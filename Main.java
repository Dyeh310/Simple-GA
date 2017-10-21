package ga.logic;

import ga.individual.Chromosome;
import ga.population.Population;

public class Main {

	public static void main(String[] args) {

		
		Chromosome c1 = new Chromosome();
		Population p1 = new Population(50);
		
		c1.createChromosome();
		
		p1.Populate();
		
		
		System.out.println(p1);
		
	
		
		
	
		
		
	}

}
