package me.riwenmao.slugsbusschedule.BusCard;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class BusCardController {

    @RequestMapping("/BusList")
    public List<BusCard> getAllBusLines(){

        //hard coded test data
        return Arrays.asList(
            new BusCard("15", "15", "10:00 AM", "UCSC/Science Hill"),
            new BusCard("16", "16", "11:00 AM", "UCSC/Science Hill"),
            new BusCard("20", "20", "09:00 AM", "UCSC/Science Hill")
        );
    }
}