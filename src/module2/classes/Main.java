package module2.classes;

public class Main {

    public static void main(String[] args) {
        Cube myCube = new Cube(5);
        System.out.println("Parameters of my cube is " + myCube.toString());
        myCube.setSide(3);
        System.out.println("New parameters of my cube is " + myCube.toString());
        System.out.println("Hash code of my cube is " + myCube.hashCode());
        Cube yourCube = new Cube(3);
        System.out.println("Parameters of your cube is " + myCube.toString());
        if(myCube.equals(yourCube))
            System.out.println("My cube and your's cube are equals");
        else
            System.out.println("My cube and your's cube are not equals");
    }
}
