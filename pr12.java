class VolumeCalculator {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    double calculateVolumeSphere(double radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {

        VolumeCalculator vc = new VolumeCalculator();

        double cubeVolume = vc.calculateVolume(5);
        System.out.println("Volume of Cube (side = 5): " + cubeVolume);

        double cuboidVolume = vc.calculateVolume(4, 5, 6);
        System.out.println("Volume of Rectangular Cube (4 x 5 x 6): " + cuboidVolume);

        double sphereVolume = vc.calculateVolumeSphere(3);
        System.out.printf("Volume of Sphere (radius = 3): %.2f\n", sphereVolume);
    }
}

output:
Volume of Cube (side = 5): 125.0
Volume of Rectangular Cube (4 x 5 x 6): 120.0
Volume of Sphere (radius = 3): 113.10
