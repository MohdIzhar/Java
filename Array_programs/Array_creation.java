package java_programs;

public class Array_creation
{
	public String name;
	public int releaseyear;
	public String director;
	
	public Array_creation(String name, int releaseyear, String director)
	{
		this.name = name;
		this.releaseyear = releaseyear;
		this.director = director;
	}
	
	public String toString()
	{
		return (this.name + ", directed by " + this.director + ", released in " + this.releaseyear);
	}
	
	
	public static void main(String[] args) {
	Array_creation[] dvdCollection = new Array_creation[15];
		
	Array_creation  avengersDVD = new Array_creation("The Avengers", 2012, "Joss Whedon");
	Array_creation incrediblesDVD = new Array_creation("The Incredibles", 2004, "Brad Bird");
	Array_creation findingDoryDVD = new Array_creation("Finding Dory", 2016, "Andrew Stanton");
	Array_creation lionKingDVD = new Array_creation("The Lion King", 2019, "Jon Favreau");

	dvdCollection[7] = avengersDVD;
	dvdCollection[3] = incrediblesDVD;
	dvdCollection[9] = findingDoryDVD;
	dvdCollection[2] = lionKingDVD;	
	
	System.out.println(dvdCollection[7]);
	System.out.println(dvdCollection[10]);
	System.out.println(dvdCollection[3]);
	
}
}