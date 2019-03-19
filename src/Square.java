public class Square {
    private String shipName = "ocean";
    private String myStatus = " ";
    private String oponentStatus = " ";


    public Square() {
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public void setMyStatus(String myStatus) {
        this.myStatus = myStatus;
    }

    public void setOponentStatus(String oponentStatus) {
        this.oponentStatus = oponentStatus;
    }

    public String getShipName() {
        return shipName;
    }

    public String getMyStatus() {
        return myStatus;
    }

    public String getOponentStatus() {
        return oponentStatus;
    }
}
