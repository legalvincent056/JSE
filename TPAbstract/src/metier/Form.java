package metier;

public abstract class Form {

	public abstract float perimetre();
	
	public abstract float surface();
	
	public float coefficientEtallement(){
		
		float lePerimetre = perimetre();
		return 16* surface() / (lePerimetre * lePerimetre);
				
	}

	
	
	
}
