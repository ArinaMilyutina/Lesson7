package task3;

import java.util.Date;

public class ContractForTheSupplyOfGoods extends Document {
    private String type;
    private int count;

    public ContractForTheSupplyOfGoods() {
        super(100, new Date());
        this.type = "clothes";
        this.count = 120;
    }

    public ContractForTheSupplyOfGoods(int numberInDocument, Date date, String type, int count) {
        super(numberInDocument, date);
        this.type = type;
        this.count = count;
        printInfo();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void printInfo() {
        System.out.println("-----------------------------------------------\nContract for the supply of goods:\nNumber of document:" + getNumber() + ".\nType: " + getType() + ".\nCount: " + getCount() + ".\nDate of document: "
                + getDate() + ".\n");
    }


}
