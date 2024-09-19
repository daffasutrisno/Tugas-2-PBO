public class TicketMachine
{
    private int price;
    private int balance;
    private int total;

    public TicketMachine(int ticketCost) {
        price = ticketCost;
        balance = 0;
        total = 0;
    }

    public int getPrice() {
        return price;
    }

    public int getBalance() {
        return balance;
    }

    public void insertMoney(int amount) {
        if (amount >= 0) balance = balance + amount; 
        else System.out.println("Invalid amount");
    }

    public int getTotal() {
        return total; 
    }

    public int calculateChange() {
      return balance;
    }

    public void printTicket() {
        if (calculateChange() >= 0) {
            System.out.println("##################");
            System.out.println("# The Show");
            System.out.println("# Ticket");
            System.out.println("# " + price + " dollars.");
            System.out.println("##################");
            
            total = total + price;
            balance = balance - price;
            
            System.out.println("# Balance Left");
            System.out.println("# " + balance + " dollars. ");
            System.out.println("##################");
        } else {
            System.out.println("Please insert more money to cover ticket price of " + (price - balance) + " dollars");
        }
    }

}