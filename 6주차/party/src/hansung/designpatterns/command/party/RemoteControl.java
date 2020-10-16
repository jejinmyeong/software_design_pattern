package hansung.designpatterns.command.party;

import java.util.Stack;

//
// This is the invoker
//
public class RemoteControl {
	Stack<Command> undoCommand = new Stack<Command>();
	Command[] onCommands;
	Command[] offCommands;
 
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
 
		Command noCommand = new NoCommand();
		for(int i=0;i<7;i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand.push(noCommand);
	}
  
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
 
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand.push(onCommands[slot]);
	}
 
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand.push(offCommands[slot]);
	}

	public void undoButtonWasPushed() {
		if(undoCommand.size() != 1) undoCommand.pop().undo();
		else System.out.println("Error : Previous command does not exist.");
	}
 
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		int i=0;
		for (i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot"+i+"]"+"( " + 2*i + ") " + onCommands[i].getClass().getName()
				+ "      \t" + "( " + (2*i+1) + ") "+offCommands[i].getClass().getName() + "\n");
		}
		stringBuff.append("[undo] ("+2*i+") " + undoCommand + "\n");
		return stringBuff.toString();
	}
}
