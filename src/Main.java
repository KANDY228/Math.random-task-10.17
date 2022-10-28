public class Main {

	public static void main(String[] args) { 
		double n1 = getFirstPlayer(1,0,10.5);
		double n2 = getFirstPlayer(1,0,10.5);
		System.out.println(n1);
		System.out.println(n2);
	}
	public static double getFirstPlayer(int sizeOfAray, double n1,double n2) {
		int firsPlayer= 0;
		sizeOfAray =1;
		int[]numbersArray;
		numbersArray = new int[sizeOfAray];
		for (int i = 0; i < numbersArray.length; i++) {
			numbersArray[i] = (int)(n1+(n2-n1)*Math.random());
			firsPlayer = 0+numbersArray[i];
		}
		return firsPlayer;
	}
	public static void calculateSquare(double n1,double n2 ) {
		double c1 = Math.pow(n1, 2);
		double c2 = Math.pow(n2, 2);
		System.out.println(c1);
		System.out.println(c2);
	}
}