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
        balance = balance + amount;
    }

    public int getTotal() {
        return total; 
    }

    public int calculateChange() {
      return (balance - price);
    }

    public void printTicket() {
        if (calculateChange() >= 0) {
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            total = total + price;
            balance = 0;
        } else {
            System.out.println("Please insert more money to cover ticket price of " + price + " cents");
        }
    }

}