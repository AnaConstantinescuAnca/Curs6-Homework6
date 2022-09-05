public class Bottle {
    private int totalCapacity = 5;
    private int availableLiquid = 4;
    private boolean open = true;

    public Bottle() {
    }

    //a method that returns true/false if the bottle has more liquid
    public boolean hasLiquid() {
        if (availableLiquid >= 0) {
            return true;
        } else {
            return false;
        }
    }

    //- a method that returns the available liquid
    public int getAvailableLiquid() {
        return this.availableLiquid;
    }

    //- a method that returns the empty capacity
    public int emptyCapacity() {
        int varEmptyCapacity = this.totalCapacity - this.availableLiquid;
        return varEmptyCapacity;
    }

    // verific stare sticla deschis/inchis

    public boolean isOpen() {
        return open;
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

    public void schimbaStare()
    {
        if(!this.open){
            this.open = true;
        }
        else{
            this.open = false;
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
        if (this.open == true) {
            if (specificAmount != 0 && specificAmount <= availableLiquid) {
                availableLiquid -= specificAmount;
                return "After drinking remained " + availableLiquid;
            } else {
                return "Can't drink more than is in a bottle";
            }
        } else {
            this.open = true;
            if (specificAmount != 0 && specificAmount <= availableLiquid) {
                availableLiquid -= specificAmount;
                return "After drinking remained " + availableLiquid;
            } else {
                return "Can't drink more than is in a bottle";
            }
        }
    }



}
