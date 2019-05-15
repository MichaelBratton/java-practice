package day43;

public class Pet {
	String species;
	String name;
	

	
	public Pet() {
		System.out.println("No args constructor");
	}

	public Pet(String Species, String name) {
		this.species = species;
		this.name = name;
		
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pet [species=" + species + ", name=" + name + "]";
	}

}
