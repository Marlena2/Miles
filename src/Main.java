public class Main {
    public static void main(String[] args) {

        int ticketCost = 2400; // рублей
        int bonus = 20; // рублей
        int miles = ticketCost / bonus;

        System.out.println("Расчет количества бонусных милей");
        System.out.println("За каждые 20 р., потраченные на билет - 1 миля");
        System.out.println("Стоимость билета: " + (ticketCost) + " р.");
        System.out.println("Начислено: " + miles + " бонусных миль");


    }

}
