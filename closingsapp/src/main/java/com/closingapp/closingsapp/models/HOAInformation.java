package com.closingapp.closingsapp.models;

public class HOAInformation {

    private boolean hoa;
    private String hoaName;
    private int hoaContactNumber;
    private String hoaContactEmail;
    private int hoaDues;
    private String hoaDuesIncrement;

    public HOAInformation(boolean hoa, String hoaName, int hoaContactNumber, String hoaContactEmail, int hoaDues, String hoaDuesIncrement) {
        this.hoa = hoa;
        this.hoaName = hoaName;
        this.hoaContactNumber = hoaContactNumber;
        this.hoaContactEmail = hoaContactEmail;
        this.hoaDues = hoaDues;
        this.hoaDuesIncrement = hoaDuesIncrement;
    }

    public boolean isHoa() {
        return hoa;
    }

    public void setHoa(boolean hoa) {
        this.hoa = hoa;
    }

    public String getHoaName() {
        return hoaName;
    }

    public void setHoaName(String hoaName) {
        this.hoaName = hoaName;
    }

    public int getHoaContactNumber() {
        return hoaContactNumber;
    }

    public void setHoaContactNumber(int hoaContactNumber) {
        this.hoaContactNumber = hoaContactNumber;
    }

    public String getHoaContactEmail() {
        return hoaContactEmail;
    }

    public void setHoaContactEmail(String hoaContactEmail) {
        this.hoaContactEmail = hoaContactEmail;
    }

    public int getHoaDues() {
        return hoaDues;
    }

    public void setHoaDues(int hoaDues) {
        this.hoaDues = hoaDues;
    }

    public String getHoaDuesIncrement() {
        return hoaDuesIncrement;
    }

    public void setHoaDuesIncrement(String hoaDuesIncrement) {
        this.hoaDuesIncrement = hoaDuesIncrement;
    }
}

