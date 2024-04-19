package popquiz;

import java.awt.*;

public class Case  {
    private String model;
    private String manufacturer;
    private String powersSupply;
    private Dimension dimension;
public Case(String model,String manufacturer,String powersSupply,Dimension dimension){
    this.model=model;
   this.manufacturer=manufacturer;
    this.powersSupply=powersSupply;
    Dimension Dimension = dimension;
}
    public void pressPowerButton(){
        System.out.println("PowerButton Pressed");
    }

}
