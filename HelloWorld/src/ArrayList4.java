import java.util.ArrayList;


public class ArrayList4 {

	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<String>();

		array.add("momo");
		//array.set(0, "toto");
		array.add(0,"toto"); //ajoute "toto" au tableau donc "momo" passe en indice 1
		
		
		System.out.println(array.get(1));
		
	}

}
