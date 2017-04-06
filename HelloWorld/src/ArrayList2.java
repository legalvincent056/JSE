import java.util.ArrayList;


public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> tab = new ArrayList<Integer>();
		
		tab.add(5);
		tab.add(25);
		tab.add(15);
		tab.add(125);
		
		//tab.clear();
		tab.remove(0);
				
		if(tab.isEmpty()){
			System.out.println("Tableau vide");
		}else {
			System.out.println(tab.get(0));
		}

	}

}
