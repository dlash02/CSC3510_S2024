import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> itemNames = new ArrayList<>();
        itemNames.add("Apple");
        itemNames.add("Banana");
        itemNames.add("Grape");

        ArrayList<Integer> itemCounts = new ArrayList<>();
        itemCounts.add(10);
        itemCounts.add(14);
//        itemCounts.add(14);

        ArrayList<Double> itemCost = new ArrayList<>();
        itemCost.add(1.5);
        itemCost.add(2.0);
//        itemCost.add(3.99 );
        ItemManager im = new ItemManager( itemNames, itemCounts, itemCost );

        ArrayList<String> hightCt = im.getHighestCountItems();

        ArrayList<String> items = im.getItemSearch( "a");

        ArrayList<String> res = im.getMostExpensiveInventory();

        double totalCost = im.getTotalCostOfAllInventory();
    }
}