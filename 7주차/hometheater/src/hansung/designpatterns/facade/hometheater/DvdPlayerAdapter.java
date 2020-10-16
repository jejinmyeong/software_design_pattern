package hansung.designpatterns.facade.hometheater;

public class DvdPlayerAdapter implements DvdPlayer{
    LGDvdPlayer lgdvdplayer;
    int currentTrack;
    
    public DvdPlayerAdapter(LGDvdPlayer lgDvdPlayer){
        this.lgdvdplayer = lgDvdPlayer;
        this.currentTrack = lgDvdPlayer.currentTrack;
    }

    public void on(){
        lgdvdplayer.on();
    }

    public void off(){
        lgdvdplayer.off();
    }

    public void eject(){
        lgdvdplayer.eject();
    }

    public void play(String movie){
        lgdvdplayer.play();
        System.out.println(" which is " + movie);
    }

    public void play(int track){
    	if(currentTrack < track)
    		for(int i = 0 ; i < track - currentTrack ; i++)
    			lgdvdplayer.next();
    	else if(currentTrack > track)
    		for(int i = 0 ; i < currentTrack - track ; i++)
    			lgdvdplayer.previous();
    }

    public void stop(){
        lgdvdplayer.stop();
    }

    public void pause(){
        lgdvdplayer.pause();
    }

    public void setTwoChannelAudio(){
        lgdvdplayer.setTwoChannelAudio();
    }

    public void setSurroundAudio(){
        System.out.println("Unsupported Method");
    }

    public String toString(){
        return lgdvdplayer.description;
    }
}