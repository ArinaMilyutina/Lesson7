package task3;

import java.util.Date;

public class ContractWithInEmployee extends Document {
    private String name;
    private Date endDate;

    public ContractWithInEmployee() {
        super(1000, new Date(99999999999L));
        this.name = "Nastya Rabtsevich";
        this.endDate = new Date();
    }

    public ContractWithInEmployee(int numberInDocument, Date date, String name, Date endDate) {
        super(numberInDocument, date);
        this.name = name;
        this.endDate = endDate;
        // printInfo();
    }


    public String getName() {
        return name;
    }


    public Date getEndDate() {
        return endDate;
    }


    @Override
    public void printInfo() {
        System.out.println("-----------------------------------------------\nContract with in employee:\nNumber of document: " + getNumber() + ".\nDate of document: " + getDate() + ".\nEnd date of document: " + getEndDate() + ".\nName of employee: " + getName() + ".\n");
    }

}
