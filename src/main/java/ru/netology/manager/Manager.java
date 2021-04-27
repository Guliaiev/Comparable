package ru.netology.manager;

import ru.netology.domain.FlyTickets;
import ru.netology.repository.Repository;

import java.util.Arrays;

public class Manager {
    private Repository repository;

    public Manager(Repository repository) {
        this.repository = repository;
    }

    public FlyTickets[] searchBy(String from, String to) {
        FlyTickets[] result = new FlyTickets[0];
        for (FlyTickets flyTickets : repository.findAll()) {
            if (flyTickets.matches(from, to)) {
                FlyTickets[] tmp = new FlyTickets[result.length + 1];
                tmp[tmp.length - 1] = flyTickets;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }
}
