public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    //abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    //todo: Getters and setters
    public String ring(){
        return ("Y");
    }
    public String unlock(){
        return (null);
    }
}