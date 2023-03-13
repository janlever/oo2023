public class Main {
    public static void main(String[] args) {
        rattarent jan = new rattarent("jan", "levertand","fatbike",5555555, 750101010101L);
        rattarent kevin = new rattarent("kevin", "poiss","BMX",5656565, 750202020202L);
        rattarent tormi = new rattarent("tormi", "naine","track",5757575, 750303030303L);

        String teade = jan.renditud();
        System.out.println(teade);

        tormi.vahetaratas("BMX");
    }
}