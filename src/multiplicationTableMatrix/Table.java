package multiplicationTableMatrix;

public class Table {
	void plot(int x, int y) {
		if (x>0 && y>0) {
//			quadrant 1
			System.out.println();
			System.out.println("Quadrant 1");
			for (int i=y; i>0; i--) {
				System.out.print(i + "\t");
				for (int j=1, l=i; j<=x; j++) {
					System.out.print(j*l + "\t");
				}
				System.out.println();
			}
			for (int k=0; k<=x; k++) {
				System.out.print(k + "\t");
			}
		}
		else if(x<0 && y>0) {
//			quadrant 2
			System.out.println();
			System.out.println("Quadrant 2");
			for (int i=y; i>0; i--) {
				for (int j=x, l=i; j<0; j++) {
					System.out.print(j*l + "\t");
				}
				System.out.print(i + "\t");
				System.out.println();
			}
			for(int k=x; k<=0; k++) {
				System.out.print(k + "\t");
			}
		}
		else if(x<0 && y<0) {
//			quadrant 3
			System.out.println();
			System.out.println("Quadrant 3");
			for(int k=x; k<=0; k++) {
				System.out.print(k + "\t");
			}
			System.out.println();
			for (int i=-1; y<=i; i--) {
				for(int j=x, l=i; j<0; j++) {
					System.out.print(j*l + "\t");
				}
				System.out.print(i + "\t");
				System.out.println();
			}
		}	
		else if(x>0 && y<0) {
//			quadrant 4
			System.out.println();
			System.out.println("Quadrant 4");
			for (int k=0; k<=x; k++) {
				System.out.print(k + "\t");
			}
			System.out.println();
			for (int i=-1; y<=i; i--) {
				System.out.print(i + "\t");
				for(int j=1, l=i; j<x; j++) {
					System.out.print(j*l + "\t");
				}
				System.out.print(i + "\t");
				System.out.println();
			}
		}
	}
}
