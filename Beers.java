package Chickenshop;

import java.time.LocalDate;

public class Beers extends Drinks{
    public float du;

    public float getDu() {
        return du;
    }

    public void setDu(float du) {
        this.du = du;
    }

    public Beers(String name, double money, LocalDate date, int days, float du) {
        super(name, money, date, 30);
        this.du = du;
    }

    @Override
    public String toString() {
        return "Beers{" +
                "du=" + du +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", date=" + date +
                ", days=" + days +
                '}';
    }
}
