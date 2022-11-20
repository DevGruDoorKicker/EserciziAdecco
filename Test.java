import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// PARI
		
		
		Numeri elementoNumeri= new Numeri();
		
		ArrayList<Integer> arrayList= new ArrayList<Integer>();
		ArrayList<Integer> arrayList2= new ArrayList<Integer>();
		
		
		
		arrayList.add(1);
		arrayList.add(21);
		arrayList.add(4);
		arrayList.add(44);
		arrayList.add(6);
		
		
		
		System.out.println(elementoNumeri.getPari(arrayList));
		System.out.println(elementoNumeri.getPari(arrayList2));
		
		
		System.out.println("##############################################"); 
		
	
		System.out.println(elementoNumeri.getArmonica(4));
		
		
		System.out.println("##############################################");
		
		
		
		
		double array2[] ={1.0,2.3, 3.6,2};
		double array3[] ={7.0,2.3, 3.6};
		double array4[] ={7.0,2.3, 3.6,90};
		double array5[] ={1.0,2.3, 3.6,2.4};
		double array6[] ={0.3719054864431781,0.006451131269484045, 0.48081334540620213,0.14209263127551597,0.9900597743987053};
		
			
	
		System.out.println(elementoNumeri.getOrdinato( array2));
//		System.out.println(elementoNumeri.getOrdinato( array3));
//		System.out.println(elementoNumeri.getOrdinato( array4));
//		System.out.println(elementoNumeri.getOrdinato( array5));
		
//		System.out.println( array5[3]);
//		System.out.println( array5[array5.length-1]);
//		System.out.println(elementoNumeri.getOrdinato(array6));
		
		
		
		System.out.println("##############################################");
		
		int array[]= {12,6,3,1};
		int array7[]= {5,6,3,1};
		
		elementoNumeri.getCrescente(array);
		
		for (int v : array) {
			
			System.out.println(v);		
		}
		
		System.out.println("##############################################");
		
		
		System.out.println(elementoNumeri.getVettori(array, array7));
		System.out.println(elementoNumeri.getVettori(array, array));
		
		
		System.out.println("##############################################");
		
		
		for (double i : array5) {
			
			System.out.println(i);
		}
		
		
		double [] povers= elementoNumeri.getReversed(array5);				
		System.out.println("Ordine inverso qui sotto:");
		
		for (double p : povers) {
			
			System.out.println(p);
		}
		
		
		System.out.println("##############################################");
		
		
		
		int array8[]= {12,6,3,12};
		int array9[]= {5,6,33,33};
		
		System.out.println(elementoNumeri.getDiversi(array9));
		System.out.println(elementoNumeri.getDiversi(array8));
		System.out.println(elementoNumeri.getDiversi(array));
		System.out.println(elementoNumeri.getDiversi(array7));
		
		
		System.out.println("##############################################");
		
		
		
		System.out.println(elementoNumeri.get3Num(array9));
		System.out.println(elementoNumeri.get3Num(array8));
		
		
		int array10[]= {12,6,3,12,12,12,12};
		int array11[]= {5,6,33,33,4,5,6,7,8,9,1,1,1};
		int array12[]= {5,6,33,33,4,5,6,7,8,9,1,1,5};
		
		
		System.out.println(elementoNumeri.get3Num(array10));
		System.out.println(elementoNumeri.get3Num(array11));
		System.out.println(elementoNumeri.get3Num(array12));

		
		System.out.println("##############################################");
		
		
		System.out.println(elementoNumeri.get3NumAlt(array9));
		System.out.println(elementoNumeri.get3NumAlt(array8));
		
		
		System.out.println(elementoNumeri.get3NumAlt(array10));
		System.out.println(elementoNumeri.get3NumAlt(array11));
		System.out.println(elementoNumeri.get3NumAlt(array12));
		
		
		
		
		int array13[]= {2,3,4,5,3,3};
		
		System.out.println(elementoNumeri.get3NumAlt(array13));
		
		System.out.println("##############################################");
		
		
		elementoNumeri.getTabellinedUpon();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
