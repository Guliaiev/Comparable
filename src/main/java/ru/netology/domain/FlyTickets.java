package ru.netology.domain;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class FlyTickets implements Comparable<FlyTickets> {
    private int id;
    private int price;
    private String departure;
    private String arrival;
    private int flightTime;

    @Override
    public int compareTo(FlyTickets o) {
        return price - o.price;

    }
    public boolean matches(String from, String to){
        return departure.equalsIgnoreCase(from) && arrival.equalsIgnoreCase(to);
    }
}
