


public class BubbleSort {
	public static void sort(int m[][]) {
		
		int temp;
		int temp2;
		
		for (int i = 0; i < 6; i++){
			for(int j = i+1; j < 6 ; j++){
				if (m[j][0] < m[i][0]) {
					temp = m[j][0];
					m[j][0] = m[i][0];
					m[i][0] = temp;
					
					temp2 = m[j][1];
					m[j][1] = m[i][1];
					m[i][1] = temp2;
				} 
			}
       	}
		
		for (int i = 0; i < 6; i++){
			for(int j = i+1; j < 6 ; j++){
				if (m[j][0] == m[i][0] && m[j][1] < m[i][1]) {
					temp = m[j][1];
					m[j][1] = m[i][1];
					m[i][1] = temp;
				
				}
			}
		}
	
	System.out.println();	
	
	}
	
	
	public static void main(String[] args) {
		
		int m[][] = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
		
		sort(m);
		
		System.out.println("{" + m[0][0] +","+ m[0][1] +"}"+"{" + m[1][0] +","+ m[1][1] +"}"+"{" + m[2][0] +","+ m[2][1] +"}"+"{" + m[3][0] +","+ m[3][1] +"}"+"{" + m[4][0] +","+ m[4][1] +"}"+"{" + m[5][0] +","+ m[5][1] +"}");
	} 
	
}

