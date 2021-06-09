package linecompare;

public class LineCompare1 {
	public static void main(String args[]) {
		System.out.println("Welcome to Line Computation");
      //Length as a point x1,x2,y2,y1
		int x1,x2,y1,y2;
		double dis;
		x1=0;
		y1=0;
		x2=1;
		y2=1;
		dis=Math.sqrt(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
		 System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
	}

}
