package Coding;

public class DuplicateRemove {

	public static void main(String[] args) {

		int[][] a= {{1,2},{1,3},{1,4}};
		int[][] b= {{1,2},{1,4}};
		int c[][]= {{0,0},{0,0}};

		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a.length;j++) {
				if(a[i][j]!=b[i][j]) {
					c[i][j]=a[i][j];
				}
			}
			System.out.println();
		}
		for(int i=0;i<=c.length;i++) {
			for(int j=0;j<=c.length;j++) {
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
		System.out.println("Output");
	}

}
