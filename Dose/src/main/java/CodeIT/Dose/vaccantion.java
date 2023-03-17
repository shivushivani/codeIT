package CodeIT.Dose;

//Abstract class Vaccine
abstract class Vaccine {
 // Concrete method for first dose
 public void firstDose(String nationality, int age) {
     if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
         System.out.println("First dose administered successfully.");
         System.out.println("Please pay Rs. 250.");
     } else {
         System.out.println("Sorry, you are not eligible for the first dose.");
     }
 }
 
 // Concrete method for second dose
 public void secondDose(boolean isFirstDoseCompleted) {
     if (isFirstDoseCompleted) {
         System.out.println("Second dose administered successfully.");
     } else {
         System.out.println("Sorry, you need to complete your first dose before taking the second dose.");
     }
 }
 
 // Abstract method for booster dose
 public abstract void boosterDose();
}

//Implementation class for booster dose
class VaccinationSuccessful extends Vaccine {
 public void boosterDose() {
     System.out.println("Booster dose administered successfully.");
 }
}

//Main class
public class vaccantion {
 public static void main(String[] args) {
     // Create object of VaccinationSuccessful
     VaccinationSuccessful vs = new VaccinationSuccessful();
     
     // Call first dose method
     vs.firstDose("Indian", 20);
     
     // Call second dose method
     vs.secondDose(true);
     
     // Call booster dose method
     vs.boosterDose();
 }
}