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
        printInfo();
        savingDocument();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public void printInfo() {
        System.out.println("-----------------------------------------------\nContract with in employee:\nNumber of document: " + getNumber() + ".\nDate of document: " + getDate() + ".\nEnd date of document: " + getEndDate() + ".\nName of employee: " + getName() + ".\n" + savingDocument());
    }

    @Override
    public String savingDocument() {
        return "The document is save in register.";
    }
}
