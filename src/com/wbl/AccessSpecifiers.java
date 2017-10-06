/* Write a program that implements various functions of different type of access modifiers
 (private,protected,default,public */
package com.wbl;

 class  Animal{
	       public String name;
                   int weight;
           private int age =5;
          protected String color="yellow";
            
           
           public void Animal(){
        	     String Type="Animal";
        	     color="brown";
           }
           public int getAge(){
        	   return age;
           }
           public void setAge(int age){
        	   this.age=age;
           }
           
          private void makenoise(){
        	 System.out.println(name+"makes noise"); 
          }
          protected void displayDetails(){
        	  System.out.println("name="+name);
        	  System.out.println("weight="+weight);
        	  System.out.println("age="+age);
        	  System.out.println("color="+color);
          }
          
 } 	              
class Dog extends Animal{
	
	public String color="white";
	public void catchThieves(){
		System.out.println(name+ " can catch the Thieves");

	}
	public void animalWeight(){
		System.out.println("weight of the animal"+weight);
	}
	public void animalColor(){
		System.out.println("color of the animal"+color);
	}
	//cannot use private outside the class
} class AccessSpecifiers{


public static void main(String[] args){
	Dog dog=new Dog();
		dog.color="pink";
		dog.name="Labrador";
		dog.weight=40;
		dog.animalColor();
		dog.animalWeight();
		dog.catchThieves();
	    dog.displayDetails();
}

}