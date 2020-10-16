package hansung.designpatterns.state.gumballstate;

public class OutOfGumballs implements State {
	GumballMachine gumballMachine;
	
	public OutOfGumballs(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub

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
	public int refill(int gumballs) {
		System.out.println("refill "+gumballs+" gumballs");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
		
		return gumballMachine.getCount()+gumballs;
		
	}
	
	public String toString() {
		return "out of number, so refilled it";
	}

}
