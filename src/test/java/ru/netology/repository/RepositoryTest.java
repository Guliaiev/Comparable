package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FlyTickets;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    Repository repository = new Repository();
    FlyTickets dmeKhv = new FlyTickets(1, 1100, "DME", "KHV", 620);
    FlyTickets svoSip = new FlyTickets(2, 5200, "SVO", "SIP", 750);
    FlyTickets dpsDme = new FlyTickets(3, 3400, "DPS", "DME", 820);
    FlyTickets dmeSip = new FlyTickets(4, 6600, "DME", "SIP", 640);
    FlyTickets khvSin = new FlyTickets(5, 2300, "KHV", "SIN", 190);


    @BeforeEach
    void setUp() {
        repository.save(dmeKhv);
        repository.save(svoSip);
        repository.save(dpsDme);
        repository.save(dmeSip);
        repository.save(khvSin);
    }

    @Test
    public void shouldFindAll() {
        FlyTickets[] actual = repository.findAll();
        FlyTickets[] expected = new FlyTickets[]{dmeKhv, svoSip, dpsDme, dmeSip, khvSin};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveById() {
        int idToRemove = 3;
        repository.removeById(idToRemove);
        FlyTickets[] actual = repository.findAll();
        FlyTickets[] expected = new FlyTickets[]{dmeKhv, svoSip, dmeSip, khvSin};
        assertArrayEquals(expected, actual);

    }
}