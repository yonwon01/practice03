package prob06;

public class Calc {

	int a;
	int b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int calculate() {
		
		return a;
	}
}

class Add extends Calc {

	@Override
	int calculate() {
		// TODO Auto-generated method stub
		int sum = 0;
		sum = a + b;
		return sum;
	}

}

class Sub extends Calc {
	@Override
	int calculate() {
		// TODO Auto-generated method stub
		int sub;
		sub = a - b;
		return sub;
	}

}

class Mul extends Calc {
	@Override
	int calculate() {
		// TODO Auto-generated method stub
		int mul;
		mul = a * b;
		return mul;
	}
}

class Div extends Calc {

	
	int calculate() {
		// TODO Auto-generated method stub
		double div;
		div = a / b;
		
		return  (int)div;
	}
}