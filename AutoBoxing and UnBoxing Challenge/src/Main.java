public class Main {
    public static void main(String[] args) {
        Bank bank=new Bank("State Bank of India");
        //bank.addBranch("Bajkul");
        if (bank.addBranch("Bajkul")){
            System.out.println("Bajkul branch created");
        }

        bank.addCustomer("Bajkul","Ramprasad Mandal",2000);
        bank.addCustomer("Kolkata","Nooralam Rahaman",4000);
        bank.addCustomer("Murshidabad","Mojaffar Ansari",6000);

        bank.addBranch("Tripura");
        bank.addCustomer("Tripura","Tiya",150.40);

        bank.addCustomerTransaction("Bajkul","Ram",203);
        bank.addCustomerTransaction("Bajkul","Sam",20233);
        bank.addCustomerTransaction("Bajkul","Rahul",20543);

        bank.listCustomers("Bajkul",true);
        bank.listCustomers("Kolkata",true);

        bank.addBranch("Mirjapur");
        if (!bank.addCustomer("Rabo","Brain",20.3)){
            System.out.println("Bank doesn't exist");
        }
        if (!bank.addBranch("Rahull")){
            System.out.println("Rahull bank already exist");
        }
        if (!bank.addCustomerTransaction("Autulla","Motherchod",20.32)){
            System.out.println("Customer doesn't exist that branch.");
        }
        if (!bank.addCustomer("Bajkul","Tim",12.21)){
            System.out.println("Customer is already exist.");
        }
    }
}
