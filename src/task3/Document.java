package task3;

import java.util.Date;

public abstract class Document {
    private int number;
    private Date date;

    public Document(int number, Date date) {
        this.number = number;
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract void printInfo();


}
