
public class TableauxMulti {

	public static void main(String[] args) {
		int [] []scores = {{5,3,6,8,3},
							{3,8,4},
							{18,14,2,9,15,12,9}
		};
		
		for(int i=0, nbRows = scores.length ; i < nbRows; i++){
			for (int j= 0, nbColumns= scores[i].length; j < nbColumns; j++){
				System.out.print(scores[i][j] + " ");
			}	System.out.println();				
		}
		
	}

}
