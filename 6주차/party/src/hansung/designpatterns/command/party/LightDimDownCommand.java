package hansung.designpatterns.command.party;

public class LightDimDownCommand implements Command {
	Light light;
	int level;
	private int step = 10;

	public LightDimDownCommand(Light light) {
		this.light = light;
		
	}
	public void execute() {
		this.level = light.getLevel();
		if(level > 0) {
			light.dim(level-step);
		}
		else System.out.println("Error : Light not on");
	}
	public void undo() {
		this.level = light.getLevel();
		light.dim(level+step);
	}
}

