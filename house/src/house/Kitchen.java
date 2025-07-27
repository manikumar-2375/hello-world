package house;

public class Kitchen {
    public void showAppliances() {
        String[] appliances = {"Fridge", "Microwave", "Oven", "Toaster"};

        // Print original array
        System.out.println("Original appliances:");
        for(String item : appliances) {
            System.out.println(item);
        }

        // Copy to a new array
        String[] copied = new String[appliances.length];
        for(int i = 0; i < appliances.length; i++) {
            copied[i] = appliances[i];
        }

        // Print copied array
        System.out.println("\nCopied appliances:");
        for(String item : copied) {
            System.out.println(item);
        }
    }
}
