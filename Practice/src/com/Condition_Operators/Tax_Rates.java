package com.Condition_Operators;

import java.util.Scanner;

public class Tax_Rates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long taxrate = sc.nextLong();
		if(taxrate >50000){
			System.out.println("Tax Rate is 30% For the Price:"+taxrate);
		}
		else if (taxrate>=20000 && taxrate<=49999) {
			System.out.println("Tax Rate is 20% For the Price:"+taxrate);
		}
		else if (taxrate>=10000 && taxrate<=19999) {
			System.out.println("Tax Rate is 10% For the Price:"+taxrate);
		}
		else if(taxrate>=0 && taxrate<=9999) {
			System.out.println("Tax Rate is 0% For the Price:"+taxrate);
		}
		else {
			System.out.println(true);
		}

	}

}
