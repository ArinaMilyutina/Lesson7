package task3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ContractWithInEmployee contract1 = new ContractWithInEmployee(101, new Date(999999999999L), "Arina Milyutina", new Date());
        ContractForTheSupplyOfGoods contract2 = new ContractForTheSupplyOfGoods(102, new Date(), "Clothes", 1002);
        FinancialInvoice invoice = new FinancialInvoice(222, new Date(), 44, 5);
        Register register = new Register();
        if (register.addDocument(contract1)) {
            register.getLastDocumentInfo();
        }
        if (register.addDocument(contract2)) {
            register.getLastDocumentInfo();
        }
        if (register.addDocument(invoice)) {
            register.getLastDocumentInfo();

        }
        System.out.println("-----------------------------------------------");
    }
}

