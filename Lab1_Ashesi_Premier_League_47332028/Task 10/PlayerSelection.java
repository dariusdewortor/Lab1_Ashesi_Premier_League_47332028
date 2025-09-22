import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
        // Initialzing variables to store data values
        String name;
        int age;
        double height;
        double weight;
        int jerseyNumber;
        String playerStatus = "";
        // Accepting player details
        Scanner input = new Scanner(System.in);
        System.out.println("Enter player name: ");
        name = input.nextLine();

        System.out.println("Enter player age: ");
        age = input.nextInt();

        System.out.println("Enter player height: ");
        height = input.nextDouble();

        System.out.println("Enter player weight: ");
        weight = input.nextDouble();

        System.out.println("Enter player jersey number: ");
        jerseyNumber = input.nextInt();
        // Converting necessary quantities
        final double pound = 0.45359237;
        final int meter = 100;
        weight *= pound;
        height *= meter;
        int weightInKg = (int) weight;
        int heightInCm = (int) height;
        // Checking eligibility
        String eligible;
        if (age >= 18 && age <= 35 && weightInKg < 90) {
            eligible = "Eligible";
        } else {
            eligible = "Not eligible";
        }
        // Determining category
        if (age < 20) {
            playerStatus = "rising star";

        } else if (age >= 20 && age <= 30) {
            playerStatus = "prime";

        } else if (age > 30) {
            playerStatus = "veteran";

        }
        // Determing position
        String position;
        switch (jerseyNumber) {
            case 2:
            case 5:
                position = "Defender";
                break;
            case 6:
            case 8:
                position = "Midfielder";
                break;
            case 7:
            case 11:
                position = "Winger";
                break;
            case 9:
                position = "Striker";
                break;
            case 10:
                position = "Playmaker";
                break;
            case 1:
                position = "Goalkeeper";
                break;
            default:
                position = "Unknown";
        }
        //Determining attacker status
            String attackerJersey;
        if (jerseyNumber == 11 || jerseyNumber == 9 || jerseyNumber == 7 || jerseyNumber == 10){
            attackerJersey = "Yes";
        }
        else{
            attackerJersey = "No";
        }
        //Determining lineup decision
        String lineupDecision;
        if (playerStatus.equals("prime")) { 
            if (weightInKg < 80) { 
                lineupDecision = "Starting lineup";
            } else { 
               lineupDecision = "Bench";
            }
        } else { 
            lineupDecision = "Bench";
        }
        
        String finalStatus = (age >= 18 && age <= 35 && weightInKg < 90) ? "Play" : "Rest";
        

         System.out.println("Player details" + "\nPlayer: " + name + "\nAge: " + age + " " + playerStatus + "\nheight: " + heightInCm + "cm"
                + "\nweight: " + weightInKg + "kg" + "\nJersey: " + jerseyNumber + "\nPosition: " + position + "\nAttacker jersey: " + attackerJersey + "\nEligibility: " + eligible + 
                "\nLineup Decision: " + lineupDecision + "\nFinal Decision: " + finalStatus);
         

    }
}
