package popquiz;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public void loadProgram( String programName){
        System.out.println(programName+"is now running...");
    }

}
