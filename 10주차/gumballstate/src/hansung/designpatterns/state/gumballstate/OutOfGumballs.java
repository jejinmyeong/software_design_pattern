package hansung.designpatterns.state.gumballstate;

public class OutOfGumballs implements State {
	GumballMachine gumballMachine;
	
	public OutOfGumballs(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Sorry, gumballs is soldout!");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub

	}

	@Override
	public void refill(int gumballs) {
		System.out.println("\nRefilling...");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
	
	public String toString() {
		return "out of number, so refilled it";
	}

}
