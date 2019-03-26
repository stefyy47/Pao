package proiect;

public interface Service {
    int buyTicket(Hall h);
    int buyTicket(Hall h, int place);
    int sellTicket(Hall h, Customer c);
}
