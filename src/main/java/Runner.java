import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");

//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");

//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2, "Islay");

//        4. Print out the index position of "Skye"
        System.out.println(scottishIslands.indexOf("Skye"));

//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);

//        7. Print the number of islands in your arraylist
        System.out.println(scottishIslands.size());

//        8. Sort the list alphabetically
        scottishIslands.sort(String::compareTo);

//        9. Print out all the islands using a for loop
        for (String island : scottishIslands) {
            System.out.println(island);
        }

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

//        2. Print the difference between the largest and smallest value
        int largestValue = Collections.max(numbers);
        int smallestValue = Collections.min(numbers);
        System.out.println(largestValue - smallestValue);

//        3. Print True if the list contains a 1 next to a 1 somewhere.
        for (int i = 0; i < numbers.size() - 1; i ++) {
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(i) == numbers.get(j)) {
                    if (i == 1 && j == 1) {
                        System.out.println(true);
                    }
                }
            }
        }

//        4. Print the sum of the numbers
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println(total);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [7, 13, 2] would have sum of 7.

        int total2 = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (i != 0) { //this avoids the out of bound error
                if (numbers.get(i) == 13 || numbers.get(i -1) == 13 ) {
                    total2 -= numbers.get(i);
                }
            }
            total2 += numbers.get(i);
        }
        System.out.println(total2);

    }

}
