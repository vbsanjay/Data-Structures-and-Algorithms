package StarPatternPrinting;

public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO PATTERN PRINTING PROGRAM IN JAVA");
        System.out.println("-------------------------------------------");
        System.out.println();

        System.out.println("-----------Square Star Pattern-------------");
        PrintPattern.SquareStarPattern(5);

        System.out.println("--------Hollow Square Star Pattern---------");
        PrintPattern.HollowSquareStarPattern(5);

        System.out.println("-----------Rhombus Star Pattern------------");
        PrintPattern.RhombusStarPattern(5);

        System.out.println("-----------Rectangle Star Pattern----------");
        PrintPattern.RectangleStarPattern(10, 4);

        System.out.println("-------Hollow Rectangle Star Pattern-------");
        PrintPattern.HollowRectangleStarPattern(10, 6);

        System.out.println("--------Parallelogram Star Pattern---------");
        PrintPattern.ParallelogramStarPattern(10, 5);

        System.out.println("-------Mirrored Rhombus Star Pattern-------");
        PrintPattern.MirroredRhombusStarPattern(5);

        System.out.println("-----------Triangle Star Pattern-----------");
        PrintPattern.TriangleStarPattern(5);

        System.out.println("-----------Pyramid Star Pattern------------");
        PrintPattern.PyramidStarPattern(5);

        System.out.println("-------Hollow Pyramid Star Pattern---------");
        PrintPattern.HollowPyramidStarPattern(4);

        System.out.println("-------Inverted Pyramid Star Pattern-------");
        PrintPattern.InvertedPyramidStarPattern(5);

        System.out.println("----Inverted Hollow Pyramid Star Pattern---");
        PrintPattern.InvertedHollowPyramidStarPattern(5);

        System.out.println("--------Half Diamond Star Pattern----------");
        PrintPattern.HalfDiamondStarPattern(5);

        System.out.println("-----------Diamond Star Pattern------------");
        PrintPattern.DiamondStarPattern(5);
    }
}
