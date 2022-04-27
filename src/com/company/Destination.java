public class Destination {
    public static void main(String[] args){
        double acceleration = -9.81;
        double time = 10;
        double velocity = 0;
        double position = 0;
        double destination;

        destination = 0.5 * (acceleration * time * time) + (velocity * time) + position;
        System.out.println("the destination is :" + destination);
    }
}
