package Q_04;

import javax.xml.crypto.Data;

public class Owner {
    // Data Member
    private String ownerName;
    private String phoneNo;

    public Owner() {
        ownerName = "Unknown"; }

    public Owner(String ownerName, String phoneNo) {
        this.ownerName = ownerName; this.phoneNo = phoneNo; }


    public String getOwnerName() {
        return ownerName; }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}