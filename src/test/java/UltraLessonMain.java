import com.ultraLesson.objectOrientation.methods.Item;
import com.ultraLesson.objectOrientation.methods.SaucePan;

public class UltraLessonMain {
    private static class Maggi extends Item {
        public Maggi(String name, double quantity, String metric) {
            super(name, quantity, metric);
        }

        public String getName() {
            return super.getName();
        }
    }

    public static void main(String[] args) {
        Maggi maggi = new Maggi("maggi", 100, "grams");
    }
}
