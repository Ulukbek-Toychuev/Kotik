import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik = new Kotik(10, 3,  "bob", "Meow!");
        kotik.chaseMouse();
        kotik.goForAWalk();
        kotik.goToTheCatLitter();
        kotik.play();
        kotik.sleep();
    }
}
