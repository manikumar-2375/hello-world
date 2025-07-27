package house;

public class Mainclass {
    public static void main(String[] args) {
        Hall hall = new Hall();
        hall.showMessage();

        System.out.println();

        Kitchen kitchen = new Kitchen();
        kitchen.showAppliances();
    }
}
