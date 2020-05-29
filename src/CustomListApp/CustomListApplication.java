package CustomListApp;


public class CustomListApplication {


    public static void main(String[] args){

        //Custom List of Strings
        CustomList<String> names = new CustomArrayList<>();

        names.add("Saif Lucero");
        names.add("Devante Rush");
        names.add("Renee Mcconnell");
        names.add("Bryson Vickers");
        names.add("Henley Martins");
        names.add("Samah Christian");
        names.add("Ricky Higgs");
        names.add("Kacie Mac");
        names.add("Alba Bowen");
        names.add("Jodi Iles");
        names.add("Renesmee Kidd");

        // Get the size of the custom List after the items are added
        System.out.println(names.getSize());

        // Print the custom List
        printList(names);

        // Test case to check if any invalid index is given throw an exception
      //  System.out.println(names.get(12));

        System.out.println(names.get(-1));


        //Custom List of Integers

        CustomList<Integer> numbers = new CustomArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);


        // Print the custom List
        printList(numbers);



    }

    private static void printList(CustomList list){

        for(int i = 0 ; i < list.getSize(); i++){
            System.out.println(list.get(i));
        }

    }


}
