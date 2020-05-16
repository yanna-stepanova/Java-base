package Lessons.lesson7;

import java.util.Date;

public class IdCard {
    private int number;
    private Date dateExpire;

    public IdCard(int n) {
        this.number = n;
    }

    public void setNumber(int newNumber) {
        this.number = newNumber;
    }
    public int getNumber() {
        return number;
    }

    public void setDateExpire(Date newDate) {
        this.dateExpire = newDate;
    }

    public Date getDateExpire() {
        return dateExpire;
    }

    }
