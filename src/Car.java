public class Car {
    private Rect carBody;
    private Rect carTop;
    private Square driverWindow;
    private Square rearWindow;
    private Person driver;
    private Circle frontTire;
    private Circle backTire;
    private Triangle beam;


    public Car() {
        carBody = new Rect();
        carTop = new Rect();
        driverWindow = new Square();
        rearWindow = new Square();
        driver = new Person();
        frontTire = new Circle();
        backTire = new Circle();
        beam = new Triangle();
    }

    public void draw() {
        carBody.makeVisible();
        carBody.changeSize(270, 100);
        carBody.moveHorizontal(-200);


        carTop.makeVisible();
        carTop.changeColor("red");
        carTop.moveHorizontal(-200);
        carTop.changeSize(200, 75);
        carTop.moveVertical(-75);

        driverWindow.makeVisible();
        driverWindow.changeColor("blue");
        driverWindow.moveHorizontal(-90);
        driverWindow.moveVertical(-60);


        rearWindow.makeVisible();
        rearWindow.changeColor("blue");
        rearWindow.moveHorizontal(-180);
        rearWindow.moveVertical(-60);


        driver.changeColor("black");
        driver.makeVisible();
        driver.moveHorizontal(-30);
        driver.moveVertical(-90);
        driver.changeSize(70, 40);

        carBody.makeVisible();


        frontTire.makeVisible();
        frontTire.changeColor("black");
        frontTire.changeSize(90);
        frontTire.moveVertical(77);
        frontTire.moveHorizontal(40);


        backTire.makeVisible();
        backTire.changeColor("black");
        backTire.changeSize(90);
        backTire.moveVertical(77);
        backTire.moveHorizontal(-90);


        beam.makeVisible();
        beam.changeSize(35, 75);
        beam.changeColor("yellow");
        beam.moveHorizontal(-40);
        beam.moveVertical(215);

    }


    public void highbeam(int max_beam) {
        // increases beam to max given beam size by increments of 5 , after max size is reached
        // the function decreases the beam size by increments of 5 back to original value of 35
        //Name: Sam Alaboudi  Id#: 101198779
        int wSizeInc = 35;
        for (; wSizeInc <= max_beam;wSizeInc += 5) {
            beam.changeSize(wSizeInc,wSizeInc);
        }
        //decrements of five;
        for (;wSizeInc >= 35;wSizeInc -= 5){
            beam.changeSize(wSizeInc,wSizeInc);
        }

    }
}
//fun idea for update, add user control of beam