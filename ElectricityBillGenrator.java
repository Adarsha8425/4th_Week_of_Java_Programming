package WeekFour;

import java.util.Scanner;

public class ElectricityBillGenrator {
    
    int getChargePerUnit(int units, int perUnitsCharges)
    {
        if(units >= 250 && units <= 350)
        {
            int charges_per_units = units * perUnitsCharges;//per unit charge is 13 rupees.

            return charges_per_units;
        }
        else if(units >= 150 && units <= 249)
        {
            return units * perUnitsCharges; //per units charges is 9 rupees.
        }
        else
        {
            return units * perUnitsCharges; //per units charges is 5 rupees.
        }

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number of Units(Electricity) : ");
        int units = sc.nextInt();

        System.out.println("Enter the per units Charges : ");
        int perUnitsCharges = sc.nextInt();

        ElectricityBillGenrator EG = new ElectricityBillGenrator();
        int electricit_bill = EG.getChargePerUnit(units, perUnitsCharges);

        System.out.println("The Electricity Bill Generated");
        System.out.println();
        
        System.out.println("Electricity Used In Month " + units + " Units");

        System.out.println("Per Units Of Electricity is " + perUnitsCharges + " RUPEES");

        System.out.println("The Total Bill Amount is: " + electricit_bill);

        sc.close();
    }
}
