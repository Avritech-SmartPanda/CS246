package museruka006;

import java.util.ArrayList;
import java.util.List;

public class VacationCalculator {

    public static void main(String[] args) {
	// write your code here
        VacationCalculator vc = new VacationCalculator();
        // Calculate some vacation costs...
        float mexicoCost = vc.calculateVacationCost(Destination.Mexico,3);
        float europeCost = vc.calculateVacationCost(Destination.Europe,7);
        float japanCost = vc.calculateVacationCost(Destination.Japan,5);

        // Print the cost...
        System.out.format(String.format("Total cost for the trip to Mexico: $%.2f%n", mexicoCost));
        System.out.format(String.format("Total cost for the trip to Europe: $%.2f%n", europeCost));
        System.out.format(String.format("Total cost for the trip to Japan: $%.2f%n", japanCost));
    }


    /**
     * Calculates the total cost for vacationing at a given location for
     * a specific number of nights.
     *
     * @param  dest the destination of the vacation
     * @return      the total cost of the vacation
     */
    public float calculateVacationCost(Destination dest, int TotalNights)
    {
        List<Expense> itenerary = new ArrayList<Expense>();
        itenerary.add(new Cruise(dest));


        float totalCost = tallyExpenses(itenerary);
        return  totalCost;

    }

    /**
     * An internal method used by VacationCalculator to loop through
     * a List of items that implement the Expense interface and
     * determine their cost
     *
     * @param  expenses A list of items that implement the Expense interface
     * @return          the total cost calculated by the items
     */
    private float tallyExpenses(List<Expense> expenses)
    {

        float totalCost =0;
        for(Expense e: expenses){
            totalCost += e.getCost();
        }
        return totalCost;
    }
}



