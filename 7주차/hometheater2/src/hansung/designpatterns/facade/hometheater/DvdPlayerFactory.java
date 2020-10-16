package hansung.designpatterns.facade.hometheater;

public class DvdPlayerFactory {
	String description;
	Amplifier amplifier;
	
	public DvdPlayerFactory(String description, Amplifier amplifier){
		this.description = description;
		this.amplifier = amplifier;
	}
		
	public DvdPlayer createDvdPlayer() {
        return new DvdPlayerAdapter(description, amplifier);
    }
}