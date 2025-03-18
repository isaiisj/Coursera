public class Main {

    public static void main(String[] args) {
        // Declare and initialize an array of superhero names
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};

        // Declare and initialize an array of years
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};

        // Print the superhero names
        System.out.println("Superhero Names:");
        // Print all the 5 superheroes names as suggested in the example
        System.out.println(superheroes[0]);
        System.out.println(superheroes[1]);
        System.out.println(superheroes[2]);
        System.out.println(superheroes[3]);
        System.out.println(superheroes[4]);

        // Print the introduction years
        System.out.println("Introduction Years:");
        // Print the introductionYear of the superheroes.
        System.out.println(introductionYears[0]);
        System.out.println(introductionYears[1]);
        System.out.println(introductionYears[2]);
        System.out.println(introductionYears[3]);
        System.out.println(introductionYears[4]);

        // Print the original name of the third superhero
        System.out.println("Original superhero name at position 3: " + superheroes[2]);
        // Modify the third superhero name
        superheroes[2] = "Thor";
        // Print the modified name of the third superhero
        System.out.println("Modieifed superhero name at position 3: " + superheroes[2]);

        // Print the original year of introduction of the third superhero
        System.out.println("Original introduction year for superhero at position 3: " + introductionYears[2]);
        // Modify the year of introduction of the third superhero
        introductionYears[2] = 2011;
        // Print the modified year of introduction of the third superhero
        System.out.println("Modified introduction year for superhero at position 3: " + introductionYears[2]);

        // Print the length of the array containing superhero names
        System.out.println("Total superheroes names in String array: " + superheroes.length);
        // Print the length of the array containing superhero year of introduction
        System.out.println("Total superheroes introduction year in int array: " + introductionYears.length);

    }
}
