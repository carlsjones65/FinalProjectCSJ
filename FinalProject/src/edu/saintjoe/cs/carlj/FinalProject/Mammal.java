package edu.saintjoe.cs.carlj.FinalProject;

public class Mammal {
	
	public String name;
	
	public Object Lifespan;
	
	/*--------------------------------------------------------*/
	
	public Mammal(String name) {
		this.name = name;
		}
	
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