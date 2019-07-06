package me.riwenmao.slugsbusschedule.BusCard;

public class BusCard {

    private String id;
    private String name;
    private String arrivalTime;
    private String arrivalLocation;

    //contstructors
    public BusCard(){
    }

    public BusCard(String id, String name, String arrivalTime, String arrivalLocation){
        super();
        this.id = id;
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.arrivalLocation = arrivalLocation;
    }

    // get/set methods
    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getArrivalTime(){
        return this.arrivalTime;
    }

    public void setArrivalTime(String arrivalTime){
        this.arrivalTime = arrivalTime;
    }

    public String getArrivalLocation(){
        return this.arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation){
        this.arrivalLocation = arrivalLocation;
    }

}