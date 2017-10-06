
package com.wbl;
public class PrintingPattern{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				if(j==1){
					System.out.print(i);
				}
				else if(j==2){
					System.out.print(" "+(i+j+2));
				}
				else if(j==3){
					System.out.print(" "+(i+j+4));
				}
				else{
					System.out.print(" "+(i+j+5));
			}
		}
	
		System.out.println(" ");

}
		}
}