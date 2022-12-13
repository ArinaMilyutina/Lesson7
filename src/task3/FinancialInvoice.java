package task3;

import java.util.Date;

public class FinancialInvoice extends Document {
    private int totalAmount;
    private int code;


    public FinancialInvoice(int i, Date date) {
        super(222, new Date());
        this.totalAmount = 10000;
        this.code = 22;
    }

    public FinancialInvoice(int numberInDocument, Date date, int totalAmount, int code) {
        super(numberInDocument, date);
        this.totalAmount = totalAmount;
        this.code = code;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public void printInfo() {
        System.out.println("-----------------------------------------------\nFinancial invoice:\nNumber of document: " + getNumber() + ".\nDate of document: " + getDate() + ".\nDepartment code: " + getCode() + ".\nTotal amount for the month: " + getTotalAmount() + ".\n");
    }
}
