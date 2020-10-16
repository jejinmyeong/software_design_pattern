package hansung.designpatterns.state.gumballstate;

public class GumballMachine {
 
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State outOfGumballs;
 
	State state;
	int count = 0;
 
	public GumballMachine(int numberGumballs) {
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		outOfGumballs = new OutOfGumballs(this);

		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noQuarterState;
		} else {
			state = outOfGumballs;
		}
	}
 
	public void insertQuarter() {
		state.insertQuarter();
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	public void refill(int gumballs){
		state.refill(gumballs);
		if(count == 0) {
			System.out.println(gumballs + " gumballs were refilled!");
			count += gumballs;
		}
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void setState(State state) {
		this.state = state;
	}
    public State getState() {
        return state;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
    
    public State getOutOfGumballs() {
        return outOfGumballs;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
