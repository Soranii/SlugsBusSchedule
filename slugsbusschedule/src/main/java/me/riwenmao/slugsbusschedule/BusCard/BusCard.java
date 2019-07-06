package me.riwenmao.slugsbusschedule.BusCard;

import java.util.Arrays;
import java.util.List;

public class BusCard {

    private String id;
    private String name;
    private String arrivalTime;
    private String arrivalLocation;

    //contstructors
    public BusCard(){
    }

    public BusCard(String location){
        //based on residential college location, return BusCard of neareast line
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

    public static List<BusCard> getAll(){
        //return results from query for all bus lines

        //for now hard code
        BusCard a = new BusCard("16", "16", "10:00 AM", "UCSC/Science Hill");
        BusCard b = new BusCard("19", "19", "5:00 PM", "UCSC/Science Hill");
        BusCard c = new BusCard("20", "20", "9:00 AM", "UCSC/Science Hill");

        return Arrays.asList(a, b, c);
    }

}