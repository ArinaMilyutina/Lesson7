package task2;

public class WriterInfo {
    public static void main(String[] args) {
        Director director = new Director("Arina", 18);
        System.out.println(director);
        Accountant accountant = new Accountant("Elizaveta", 22);
        System.out.println(accountant);
        Worker worker = new Worker("Sasha", 26);
        System.out.println(worker);
    }
}
