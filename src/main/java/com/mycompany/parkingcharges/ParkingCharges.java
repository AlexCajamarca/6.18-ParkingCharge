/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parkingcharges;

/**
 *
 * @author alexc
 */
import java.util.Scanner;
public class ParkingCharges {

public void startCharging()

{
Scanner input= new Scanner(System.in);
double totalReceipts = 0.0;
double fee;
double hours;

System.out.print("Enter number of hours (-1 to quit ): ");
hours = input.nextDouble();

while(hours>0.0)
{
fee = calculateCharges(hours);
totalReceipts += fee;
System.out.printf("Current charge: $%.2f\nTotal receipts: $%.2f\n"
,fee,totalReceipts);
System.out.print("Enter number of hours (-1 to quit ): ");
hours = input.nextDouble();
}
}

public double calculateCharges(double hours)

{
double charge = 2.0;

if(hours>3.0)
{
charge += (hours-3)*0.5;
}

if(charge > 10) 
{
charge=10.0;
}

return charge;

}
}
