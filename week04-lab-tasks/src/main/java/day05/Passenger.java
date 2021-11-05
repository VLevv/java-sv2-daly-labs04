package day05;

public class Passenger {
    private String name;
    private String ticket;
    private int packages;

    public Passenger(String name, String ticket, int packages) {
        this.name = name;
        this.ticket = ticket;
        this.packages = packages;
    }

    public String getName() {
        return name;
    }

    public String getTicket() {
        return ticket;
    }

    public int getPackages() {
        return packages;
    }
}
