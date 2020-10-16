package hansung.designpatterns.state.gumballstate;

public class SoldOutState implements State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
    	this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		
	}
 
	public void ejectQuarter() {
		
	}
 
	public void turnCrank() {
		
	}
 
	public void dispense() {
		
	}
 
	public String toString() {
		return "sold out";
	}

	@Override
	public int refill(int gumballs) {
		// TODO Auto-generated method stub
		System.out.println("refill "+gumballs+" gumballs");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
		
		return gumballMachine.getCount()+gumballs;
	}
}
