public class Machine {
    private Item[][] items;

    public Machine(Item[][] items) {
        this.items = new Item[items.length][items[0].length];
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                this.items[i][j] = new Item(items[i][j]);
            }
        }
    }
    
    public Item getItem(int index1, int index2) {
        return new Item(this.items[index1][index2]);
    }
    
    public void setItem(Item item, int index1, int index2) {
        this.items[index1][index2] = new Item(item);
    }

    public boolean dispense(int row, int spot) {
        if (this.items[row][spot].getQuantity() > 0) {
            items[row][spot].setQuantity(items[row][spot].getQuantity() - 1);
            return true;
        } 
        return false;
    }

    public String toString() {

        String temp = "";
        for (int i = 0; i < items.length; i++) {
            temp += "\t";
            for (int j = 0; j < items[i].length; j++) {
                temp += items[i][j].toString() + " ";
            }
            temp += "\n\n";
        }
        temp += "\t************************************************";
        return temp;
    }

}
