package Assisted_Practice_project;

public class Class_and_Object {

	String name;    
    int age; 
    String color; 
    public Class_and_Object(String name, int age, String color) {
		
    	 this.name = name;   
         this.age = age; 
         this.color = color;
	} 
    public String getName() 
    { 
        return name; 
    } 
    public int getAge() 
    { 
        return age; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
    @Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+ ".\n age and color are "  + this.getAge()+ ", and " + this.getColor() + "."); 
    } 
    public static void main(String[] args) 
    { 
    	Class_and_Object scott = new Class_and_Object("anu",10,"white");
        System.out.println(scott.toString()); 
    } 

}
