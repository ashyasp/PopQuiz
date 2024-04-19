package popquiz;

public class PC  {



    Case aCase;
     Motherboard motherboard;
     Monitor monitor;

    public PC (Case aCase,Motherboard motherboard,Monitor monitor){
this.aCase=aCase;
this.monitor=monitor;
this.motherboard=motherboard;
    }
    private void drawLogo(){
Monitor.drawPixel(5,2,"Blue");
    }
public void description(){
    System.out.println("Welcome to Worst Buy below is the description of the PC on sale today: "+"/n"+ aCase+monitor+ motherboard);
}
    @Override
    public String toString() {
        return "PC{" +
                "aCase=" + aCase +
                ", motherboard=" + motherboard +
                ", monitor=" + monitor +
                '}';
    }
public void powerUp(){

}
}
