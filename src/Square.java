public class Square {
    private String shipName = "ocean";
    private String myStatus = " ";
    private String oponentStatus = " ";


    public Square() {
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public void setMyStatus(String status) {
        this.status = myStatus;
    }

    public void setOponentStatus(String status) {
        this.status = oponentStatus;
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

    @Override
    public String toString() {
        return status;
    }
}
