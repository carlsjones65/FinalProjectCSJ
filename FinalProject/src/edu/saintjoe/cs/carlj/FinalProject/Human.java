package edu.saintjoe.cs.carlj.FinalProject;

public class Human {
	
public final String name;
	
	public String Language;
	
	/*----------------------------------------------*/
	//Bonus:
	//this is an example of overriding because mammal
	//has the exact same method in its code with 
	//the same name
	// this is also an example of overloading too
	//because C1 and C2 are in the same class, have
	//the same name, but have different signatures
	//C1
	public Human(String name) {
		this.name = name;
		}
	
	//C2
	public Human(String name, String Language) {
		this.name = name;
		this.Language = Language;
		}
	
	public String getname() {
		return name;
		
	}
	public String getlanguage() {
		return Language;
		
	}
		
	}
	
