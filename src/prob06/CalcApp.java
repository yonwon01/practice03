package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		breakOut:
		while (true) {
			int result = 0;
			/* 코드를 완성 합니다 */
			System.out.print(">> ");

			String expression = scanner.nextLine();

			if ("quit".equals(expression)) {
				break;
			}

			String[] tokens = expression.split(" ");
			int a = Integer.parseInt(tokens[0]);
			String operator = tokens[1];
			int b = Integer.parseInt(tokens[2]);

			switch (operator) {
			case "+":
				Add add = new Add();
				add.setValue(a, b);
				result = add.calculate();
				System.out.println(">> " + result);
				break;
			case "-":
				Sub sub = new Sub();
				sub.setValue(a, b);
				result = sub.calculate();
				System.out.println(">> " + result);
				break;
			case "*":
				Mul mul = new Mul();
				mul.setValue(a, b);
				result = mul.calculate();
				System.out.println(">>" + result);
				break;
			case "/":
				Div div = new Div();
				div.setValue(a, b);
				result = div.calculate();
				System.out.println(">>" + result);
				break;
			case "quit":
				System.out.println("종료합니다.");
				break breakOut;
			
			default :
				System.out.println("잘 못 입력하였습니다. 다시 입력해 주세요");
				

			}
		}

		scanner.close();

	}

}
