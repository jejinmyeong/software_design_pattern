package hansung.designpatterns.facade.hometheater;

public class DvdPlayerAdapter extends LGDvdPlayer implements DvdPlayer{
	
	public DvdPlayerAdapter(String description, Amplifier amplifier) {
        super(description, amplifier);
    }

    public void on(){
        super.on();
    }

    public void off(){
        super.off();
    }

    public void eject(){
        super.eject();
    }

    public void play(String movie){
        super.play();
        System.out.println(" which is " + movie);
    }

    public void play(int track){
    	if(currentTrack < track)
    		for(int i = 0 ; i < track - currentTrack ; i++)
    			super.next();
    	else if(currentTrack > track)
    		for(int i = 0 ; i < currentTrack - track ; i++)
    			super.previous();
    }

    public void stop(){
        super.stop();
    }

    public void pause(){
        super.pause();
    }

    public void setTwoChannelAudio(){
        super.setTwoChannelAudio();
    }

    public void setSurroundAudio(){
        System.out.println("Unsupport Method");
    }

    public String toString(){
        return super.description;
    }
}