package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {

            for (int j = 0; j < cathetusLength - i; j++) {
                System.out.print(" ");
            }


            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }




            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
