package fr.unilim.iut.testGit;

public class HelloWorld {
	public static void main (String args[]) {
		System.out.println("hello world!");
		System.out.println( "Jouons ensemble!" );
		
		System.out.println( "Et si on jouait au FizzBuzz ?" );  
        System.out.println(FizzBuzz.jouer());
        
        System.out.println( "Et si on jouait au Marabout ?" );  
        System.out.println(Marabout.jouer());

        System.out.println( "Et si on jouait au Marabout de manière plus simple ?" );  
        System.out.println(MaraboutSimple.getResult());
	}
}
