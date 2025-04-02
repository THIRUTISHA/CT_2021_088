package Q_04;

public class Bicycle {
   // Data Member
    private Owner owner;

    public Bicycle() {
        this.owner = new Owner(); }

    public Bicycle(String name, String num) {
        this.owner = new Owner(name, num); }

    public String getOwnerName() {
        return owner.getOwnerName(); }

    public void setOwnerName(String name) {
        owner.setOwnerName(name); }

    public String getPhoneNo() {
        return owner.getPhoneNo(); }

    public void setPhoneNo(String num) {
        owner.setPhoneNo(num);
    }
}
