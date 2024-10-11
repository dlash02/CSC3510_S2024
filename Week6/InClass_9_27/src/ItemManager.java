import java.util.ArrayList;

public class ItemManager {
    ArrayList<String> itemNames;
    ArrayList<Integer> itemCounts;
    ArrayList<Double> itemCost;
    public ItemManager(ArrayList<String> itemNames, ArrayList<Integer> itemCounts, ArrayList<Double> itemCost ) {
        this.itemNames = itemNames;
        this.itemCounts = itemCounts;
        this.itemCost = itemCost;
    }

    public ArrayList<String> getHighestCountItems(){
        // Find the names of item(s) with the highest count.
        // If 2 or more items are tied with the highest count return them all in the arrayList.
        // For example, if the
        //           itemNames are "Nibmbus, Wand, Cloak" and
        //           itemCounts are 55, 22, 55
        // Then returns an arrayList with item 1 set to Nimbus and item 2 to Cloak.
        // Example 2 -
        //           itemNames are "Nibmbus, Wand, Cloak" and
        //           itemCounts are 55, 22, 133
        // Then returns an arrayList with item 1 set to Cloak.
        // Example 3 -
        //           itemNames are "Nibmbus, Wand, Cloak" and
        //           itemCounts are 133, 133, 133
        // Then returns an arrayList with item 1 => "Nibmbus", Item2 -> "Wand", Item3 -> "Cloak"

        ArrayList<String> mostCountItems = new ArrayList<>();

        return mostCountItems;
    }

    public ArrayList<String> getItemSearch( String lookFor ){
        // Return an ArrayList of item(s) that contains the string lookFor
        //
        // For example, if the
        //           itemNames are "Nibmbus, BLue Wand, Cloak and Red Wand
        //           Lookfor is 'bus'
        //           then return  an arraylist containing only  Numbus
        // Example 2
        //           itemNames are "Nibmbus, Blue Wand, Cloak and Red Wand
        //           Lookfor is 'and'
        //           then return  an arraylist containing Blue Wand, Red Wand
        // Example 3
        //           itemNames are "Nibmbus, Blue Wand, Cloak and Red Wand
        //           Lookfor is 'xxx'
        //           then return an empty arraylist
        ArrayList<String> gotItems = new ArrayList<>();

        return gotItems;
    }
    public double getTotalCostOfAllInventory( ){
        // Return the total cost of all inteventory items
        // The cost of a single item is its cost * count
        // For example if an item has count 5 and cost 10.00 then its total cost is $50
        // For example if you had 2 items
        //              Item1 => cost 10, count 5 and
        //              Item2 => cost 5 count 5
        // This method would return 75.00 (50+25)

        double totalCost = 0;

        return totalCost;
    }
    public ArrayList<String> getMostExpensiveInventory( ){
        // Returns an arraylist of the names of the most expensive items
        //  For example if item1 had cost 10 and count 4 and name broom
        //                 item2 had cost 5 and count 2  and name wand
        //                 item3 had cost 20 and count 2 and name ball
        //  return an array list containing broom and ball
        //         since each are tied for most expensive at 40
        // Example 2  => item1 had cost 10 and count 4 and name broom
        //               item2 had cost 5 and count 2  and name wand
        //               item3 had cost 20 and count 10 and name ball
        //        return an array list containing ball
            ArrayList<String> mostEpensiveItems = new ArrayList<>();

            return mostEpensiveItems;
    }

}
