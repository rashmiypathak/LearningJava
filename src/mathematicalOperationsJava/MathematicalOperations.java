package mathematicalOperationsJava;

public class MathematicalOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Post Increment:
		int a = 10;
		int b = a++;
		System.out.println("a=" +a); //11
		System.out.println("b=" +b); //10
		
		int c = -99;
		int d = c++;
		System.out.println("c=" +c); //-98
		System.out.println("d=" +d); //-99
		
		
		//Pre Increment:
		int e = 0;
		int f = ++e;
		System.out.println("e=" +e);//1
		System.out.println("f=" +f);//1
		
		byte g = -99;
		byte h = ++g;
		System.out.println("g=" +g);//-98
		System.out.println("h=" +h);//-98
		
		
		//Post Decrement:
		int i = 1;
		int j = i--;
		System.out.println("i=" +i);// 0
		System.out.println("j=" +j);//1
		
		//Pre Decrement:
		int k = 1;
		int l = --k;
		System.out.println("k=" +k);// 0
		System.out.println("l=" +l);//0
		
		
		System.out.println(0.0/0.0);
		System.out.println(0.0/0);
		System.out.println(0/0.0);
		System.out.println(10/0.0);
		System.out.println(9.0/0.0);
		System.out.println(9.0/0);
		
		char val = 'a';
		System.out.println((int)val++);
		System.out.println((int)val);
		System.out.println(val++);
		System.out.println(val);
	}

}
