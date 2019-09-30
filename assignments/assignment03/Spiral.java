import java.util.Arrays;

public class Spiral {
	public int[] spiralOrder(int[][] matrix) {
		int i,j = 0;
		int row = matrix.length;
		int col = matrix[0].length;
		int x = 0;
		int res[] = new int[row*col];
		int count = 0;
		
		while(count<((row)*(col))) {
			for(i=0+x;i< col-x;i++)
				res[count++] = matrix[x][i];
			for(j=1+x; j<row-x; j++)
				res[count++] = matrix[j][col-1-x];
			for(i=col-2-x; i >= 0+x; i-- )
				res[count++] = matrix[row-1-x][i];
			for(j=row-2-x; j>=1+x; j--)
				res[count++] = matrix[j][x];
			x++;
		}
		return res;
	}

	public static void main(String[] args) {	
		Spiral sp = new Spiral();
		
		int[][] matrix = new int[][]{{ 1, 2, 3 },{ 4, 5, 6 },{ 7, 8, 9 }};
		int[] res = sp.spiralOrder(matrix);
		
		System.out.println(Arrays.toString(res));
		
		//[1,2,3,6,9,8,7,4,5]
}
}