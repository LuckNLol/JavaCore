package Lesson7.HW.Ex6;

public class Vector3D extends Vector{

    public Vector3D(int x1, int y1, int z1, int x2, int y2, int z2) {
        super(x1, y1, z1, x2, y2, z2);
    }

    @Override
    double getLength() {
        System.out.print("Длина вектора 3D: ");
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
    }

    @Override
    String getVectorCords() {
        return "Координаты вектора 3D: (" + (x2 - x1) + "; " + (y2 - y1) + "; " + (z2 - z1) + ")";
    }

    public double getScalarProduct(Vector3D vector3D){
        String cords = getVectorCords();
        String cords2 = vector3D.getVectorCords();
        int a = Integer.parseInt(cords.split(" ")[0]) * Integer.parseInt(cords2.split(" ")[0]);
        int b = Integer.parseInt(cords.split(" ")[1]) * Integer.parseInt(cords2.split(" ")[1]);
        int c = Integer.parseInt(cords.split(" ")[2]) * Integer.parseInt(cords2.split(" ")[2]);
        return a + b + c;
    }
}
