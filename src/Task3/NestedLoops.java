package Task3;

public class NestedLoops {
    public static void drawFigures() {
        int size = 5;
        for (int raw = 0; raw < size; raw++) {
            for (int column = 0; column < size; column++) {
                System.out.print("#");
            }
            System.out.println();
        }
        size = 8;
        // (a)
        System.out.println();
        for (int raw = 0; raw < size; raw++) {
            for (int column = 0; column <= raw; column++) {
                System.out.print("#");
            }
            System.out.println();

        }
        // (b)
        System.out.println();
        for (int raw = 0; raw < size; raw++) {
            for (int column = 0; column < size - raw; column++) {
                System.out.print("#");
            }
            System.out.println();

        }
        // (c)
        System.out.println();
        for (int raw = 0; raw < size; raw++) {
            for (int column = 0; column < size; column++) {
                System.out.print( (column >= raw ? "#" : " ") );
            }
            System.out.println();
        }
        // (d)
        System.out.println();
        for (int raw = 0; raw < size; raw++) {
            for (int column = 0; column < size; column++) {
                System.out.print( (column >= (size - raw) ? "#" : " ") );
            }
            System.out.println();
        }
        // (e)
        size = 7;
        System.out.println();
        for (int raw = 0; raw < size; raw++) {
            for (int column = 0; column < size; column++) {
                if (raw == 0 || raw == size - 1) {
                    System.out.print("#");
                    continue;
                }
                if (column == 0 || column == size - 1) {
                    System.out.print("#");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        // (f)
        System.out.println();
        for (int raw = 0; raw < size; raw++) {
            for (int column = 0; column < size; column++) {
                if (raw == 0 || raw == size - 1) {
                    System.out.print("#");
                    continue;
                }
                System.out.print((column == raw ? "#" : " "));
            }
            System.out.println();
        }
        // (g)
        System.out.println();
        for (int raw = 0; raw < size; raw++) {
            for (int column = 0; column < size; column++) {
                if (raw == 0 || raw == size - 1) {
                    System.out.print("#");
                    continue;
                }
                System.out.print((column == size - raw - 1 ? "#" : " "));
            }
            System.out.println();
        }
        // (h)
        System.out.println();
        for (int raw = 0; raw < size; raw++) {
            for (int column = 0; column < size; column++) {
                if (raw == 0 || raw == size - 1) {
                    System.out.print("#");
                    continue;
                }
                if (column == raw || column == size - raw - 1) {
                    System.out.print("#");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        // (i)
        System.out.println();
        for (int raw = 0; raw < size; raw++) {
            for (int column = 0; column < size; column++) {
                if (raw == 0 || raw == size - 1) {
                    System.out.print("#");
                    continue;
                }
                if (column == raw || column == size - raw - 1 || column == 0 || column == size - 1) {
                    System.out.print("#");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
