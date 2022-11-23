public class Main {


    public static void main(String[] args) {


        MagicBox<String> stringMagicBox = new MagicBox<>(5);

        boolean add = stringMagicBox.add("кролик");
        boolean add1 = stringMagicBox.add("шарик");
        boolean add2 = stringMagicBox.add("мешура");
        boolean add3 = stringMagicBox.add("канфети");
        boolean add4 = stringMagicBox.add("шляпа");

        System.out.println(add + " " + add1 + " " + add2 + " " + add3 + " " + add4);

        String pick = stringMagicBox.pick();

        System.out.println(pick);
    }
}