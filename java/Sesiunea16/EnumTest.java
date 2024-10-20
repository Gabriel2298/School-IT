package Sesiunea16;

// Create an enum called LightColor that represents the three colors of a traffic light: red, yellow, and green.
// Each color should have a string representation and a duration (in seconds) associated with it
// (e.g., red = "Stop", 30 seconds; yellow = "Caution", 5 seconds; green = "Go", 45 seconds).

public class EnumTest {
    public static void main(String... args) {
        LightColor redLight = LightColor.RED;
        LightColor greenLight = LightColor.GREEN;
        LightColor yellowLight = LightColor.YELLOW;
        System.out.println(redLight.getText());
        System.out.println( redLight.getDuration());
        System.out.println("\n" + greenLight.getText());
        System.out.println(greenLight.getDuration());
        System.out.println("\n" + yellowLight.getText());
        System.out.println(yellowLight.getDuration());

        for (LightColor color : LightColor.values()){
            System.out.println(color.name() + ": " + color.getText() + ", " + color.getDuration() + " seconds!");
        }



    }

    public enum LightColor {
        RED("Stop", 30),
        YELLOW("Caution", 5),
        GREEN("GO", 45);

        private  String text;
        private  int duration; // in seconds

        LightColor(String text, int duration) {
            this.text = text;
            this.duration = duration;
        }

        public int getDuration() {
            return duration;
        }

        public String getText() {
            return text;
        }
    }
}

