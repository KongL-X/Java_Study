package Chickenshop;

import java.time.LocalDate;

public class Juice extends Drinks {
    public Juice(String name, double money, LocalDate date, int days) {
        super(name, money, date, 2);
    }

    @Override
    public String toString() {
        return "Juice{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", date=" + date +
                ", days=" + days +
                '}';
    }
}
