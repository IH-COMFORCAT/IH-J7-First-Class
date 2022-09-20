import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] names = {"Jaume", "Oxana", "Alejandro", "Irina", "Ricardo"};

        System.out.println("====For loop====");

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("====While loop====");

        int counter = 0;
        while(counter < names.length) {
            System.out.println(names[counter]);
            counter++;
        }


        int max = 3;

        System.out.println("====Do While loop====");
        System.out.println("El valor de counter es: " + counter);

        do {
            System.out.println(counter);
            counter++;
        } while (counter < max);


        System.out.println("=== For Each===");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("===Streams===");

        Arrays.asList(names).stream().forEach(System.out::println);

        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if ( i + 1 == numbers.length) {
                result[i] = numbers[0] * numbers[i];
            } else {
                result[i] = numbers[i] * numbers[i+1];
            }
        }

        for (int num : result) {
            System.out.println(num);
        }


        int[] result2 = new int[numbers.length];

        String name = "Jaume";
        name = "Alejandro";


        int counter = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            result2[counter++] = numbers[i];
        }



    }
}