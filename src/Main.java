public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Bank bank1 = new Bank();

        Employee employee1 = new Employee("Nikita", "Lead", 2000);
        Employee employee2 = new Employee("Bogdan", "Mid", 1000);
        Employee employee3 = new Employee("NLESHA", "Manager", 20);

        Client client1 = new Client("Bob", "Miller", "Aleja Rzejapospoilie 23", "+422342323");
        Client client2 = new Client("Bobsds", "Milsadler", "Aleja Rzeasdasdjapospoilie 23", "+42sadasd2342323");

        Account a1 = bank.createAccount();
        Account a2 = bank.createAccount();

        client1.addAccount(a1);
        client1.addAccount(a2);

        a1.addOperation(12,"dfghj");
        a1.addOperation(12,"dfghj");
        a1.addOperation(12,"dfghj");

        System.out.println(Bank.getBanks());
//
//        bank.saveAccountToFile("C:\\Games\\text\\1.txt");

//        bank.loadAccountFromFile("C:\\Games\\text\\1.txt");
//        System.out.println(bank);

    }
}
