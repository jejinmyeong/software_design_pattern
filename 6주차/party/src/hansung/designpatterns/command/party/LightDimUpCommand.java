package hansung.designpatterns.command.party;

public class LightDimUpCommand implements Command{
	Light light;
	int level;
	private int step = 10;

	public LightDimUpCommand(Light light) {
		this.light = light;
		
	}
	public void execute() {
		level = light.getLevel();
		if(level > 0 && level < 100) {
			this.level += step;
			light.dim(level);
		}
		else if(level == 100) System.out.println("Error : Light brightness is the maximum. ");
		else if(level == 0) System.out.println("Error : Light not on");
	}
	public void undo() {
		level = light.getLevel();
		light.dim(level-step);
	}
}
