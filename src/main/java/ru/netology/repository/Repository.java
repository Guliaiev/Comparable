package ru.netology.repository;

import ru.netology.domain.FlyTickets;

public class Repository {
    private FlyTickets[] flyTicketss = new FlyTickets[0];

    public FlyTickets[] findAll() {
        return flyTicketss;
    }

    public void save(FlyTickets flyTickets) {
        int length = flyTicketss.length + 1;
        FlyTickets[] tmp = new FlyTickets[length];
        System.arraycopy(flyTicketss, 0, tmp, 0, flyTicketss.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = flyTickets;
        flyTicketss = tmp;
    }

    public void removeById(int id) {
        int length = flyTicketss.length - 1;
        FlyTickets[] tmp = new FlyTickets[length];
        int index = 0;
        for (FlyTickets flyTickets : flyTicketss) {
            if (flyTickets.getId() != id) {
                tmp[index] = flyTickets;
                index++;
            }
        }
        flyTicketss = tmp;
    }

}
