package Chickenshop;

import java.time.LocalDate;

public abstract class Drinks {
   protected String name;
   protected double money;
   protected LocalDate date;
   protected int days;


    public Drinks(String name, double money, java.time.LocalDate date, int days) {
        this.name = name;
        this.money = money;
        this.date = date;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public boolean judgeDate(LocalDate date, LocalDate now){
        LocalDate newDate=date.plusDays(this.days);
        int i=now.compareTo(newDate);
        if(i>0)
            return true;
        else{
            return false;
        }
    }

    public abstract String toString();
}
