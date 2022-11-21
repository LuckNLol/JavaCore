package Lesson7.HW.Ex6;

public class MainVector {
    public static void main(String[] args) {
        Vector2D vector2D = new Vector2D(3,2,2, 4);
        System.out.println(vector2D.getLength());
        System.out.println(vector2D.getVectorCords());
        //System.out.println(vector2D.getScalarProduct(new Vector2D(3,2,2,4)));
        //System.out.println(vector2D.getAngle(new Vector2D(3,2,2,4)));
        System.out.println();

        Vector3D vector3D = new Vector3D(3,2,1, 1, 2, 3);
        System.out.println(vector3D.getLength());
        System.out.println(vector3D.getVectorCords());

    }
}
