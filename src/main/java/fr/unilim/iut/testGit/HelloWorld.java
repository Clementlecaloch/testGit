package fr.unilim.iut.testGit;

public class HelloWorld {
	public static void main (String args[]) {
		System.out.println("hello world!");
		System.out.println( "Jouons ensemble!" );
		
		System.out.println( "Et si on jouait au FizzBuzz ?" );  
        System.out.println(FizzBuzz.getResult());
        
        System.out.println( "Et si on jouait au Marabout ?" );  
        System.out.println(Marabout.getResult());
	}
}
