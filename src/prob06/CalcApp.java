package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			
			/*  코드를 완성 합니다 */
			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			if( "quit".equals( expression ) ) {
				break;
			}
			
			String[] tokens = expression.split( " " );
			int a = Integer.parseInt( tokens[0] );
			String operator = tokens[1];
			int b = Integer.parseInt( tokens[2] );
			
			switch( operator ) {
				case "+" : 
					/*Add add = new Add();
					add.setValue( a, b );
					int result = add.calculate();
					*/
					
					break;
					case "-" :
				
			}
		}
		
		scanner.close();

	}

}
