package com.wbl;

class garbage{
	int i;
	garbage(int i){
		this.i=i;
	}
	protected void finalize() throws Throwable{
		System.out.println("I am in Finalize " +i);
	}
}


public class ExplicitGarbageCollection {

	public static void main(String[] args) {
		garbage gb1=new garbage(20);
		garbage gb2=new garbage(5);
		gb1=gb2;
		System.gc();
		System.out.println("I am done");
		
      
	}

}
