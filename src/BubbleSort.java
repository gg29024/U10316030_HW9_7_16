


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
	
	}
	
	
	public static void main(String[] args) {
		
		int m[6][2] = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
		
		
		
		System.out.print(m[0][0]);
	} 
	
}

