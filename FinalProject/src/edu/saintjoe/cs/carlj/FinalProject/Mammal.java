package edu.saintjoe.cs.carlj.FinalProject;

public class Mammal {
	
	public final String name;
	
	public Object Lifespan;
	
	/*--------------------------------------------------------*/
	//Bonus:
	//this is an example of overloading, C1 and C2 have
	//the same name, different signatures, and are in 
	//the same class
	//C1
	public Mammal(String name) {
		this.name = name;
		}
	//C2
	public Mammal(String name, Object Lifespan) {
		this.name = name;
		this.Lifespan = Lifespan;
	}
	
	public String getname() {
		return name;
	}
	
	public Object getlifespan() {
		return Lifespan;
		
	}
	public String toString() {
	    return name + "='" + Lifespan + "'";
	    }
	
	
	
}