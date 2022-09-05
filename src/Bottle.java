public class Bottle {
    //- a method that drinks a specific amount of liquid  and returns a message
    int specificAmount = 1;
    private int totalCapacity = 5;
    private int availableLiquid = 3;
    private boolean open = true;

    public Bottle() {

    }

    public Bottle(int totalCapacity, int availableLiquid, boolean open) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    //- a method that returns the available liquid

    //- a method that returns the empty capacity

    //a method that returns true/false if the bottle has more liquid
    public boolean isMoreLiquid(int liquidOfBottle) {
        if (availableLiquid < liquidOfBottle) {
            return true;
        } else {
            return false;
        }
    }

    //- a method that opens the bottle and returns a message ("Bottle is opened")
    public String openBottle() {
        if (this.open == true) {
            return "The bottle is already open";
        } else {
            this.open = true;
            return "Bottle is opened";
        }
    }

    //- a method that closes the bottle and returns a message
    public String closeBottle() {
        if (this.open == true) {
            this.open = false;
            return "The bottle was closed";
        } else {
            return "The bottle is already closed";
        }
    }

    //- a method that drinks a specific amount of liquid  and returns a message
    public String drinksLiquid(int specificAmount) {
        if (specificAmount != 0 && specificAmount <= availableLiquid) {
            availableLiquid -= specificAmount;
            return "After drinking remained " + availableLiquid;
        } else {
            return "Can't drink more than is in a bottle";
        }
    }
}
