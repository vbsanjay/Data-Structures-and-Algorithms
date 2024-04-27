package StarPatternPrinting;

public class PrintPattern {
    private static int length;
    private static int breadth;

    // Square Star Pattern, Difficulty: Easy
    //****
    //****
    //****
    //****
    public static void SquareStarPattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Hollow Square Star Pattern, Difficulty: Easy
    //*****
    //*   *
    //*   *
    //*   *
    //*****
    public static void HollowSquareStarPattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (i == 0 || i == n - 1) System.out.print("*");
                else if(j == 0 || j == n - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    // Rhombus Star Pattern, Difficulty: Easy
    //*****
    // *****
    //  *****
    //   *****
    //    *****
    public static void RhombusStarPattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n + i; j++){
                if (j < i) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
    // Rectangle Star Pattern, Difficulty: Easy
    //**********
    //**********
    //**********
    //**********
    public static void RectangleStarPattern(int length, int breadth){
        for(int i = 0; i < breadth; i++){
            for(int j = 0; j < length; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Hollow Rectangle Star Pattern, Difficulty: Easy
    //**********
    //*        *
    //*        *
    //*        *
    //*        *
    //**********
    public static void HollowRectangleStarPattern(int length, int breadth){
        for(int i = 0; i < breadth; i++){
            for(int j = 0; j < length; j++){
                if (i == 0 || i == breadth - 1) System.out.print("*");
                else if(j == 0 || j == length - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    // Parallelogram Star Pattern, Difficulty: Easy
    //**********
    // **********
    //  **********
    //   **********
    //    **********
    public static void ParallelogramStarPattern(int length, int breadth){
        for(int i = 0; i < breadth; i++){
            for(int j = 0; j < length + i; j++){
                if (j < i) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
    // Mirrored Rhombus Star Pattern, Difficulty: Medium
    //    *****
    //   *****
    //  *****
    // *****
    //*****
    public static void MirroredRhombusStarPattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n + n - 1 - i; j++){
                if (j >= n - i - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    // Triangle Star Pattern, Difficulty: Easy
    //*
    //**
    //***
    //****
    //*****
    public static void TriangleStarPattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Pyramid Star Pattern, Difficulty: Medium
    //    *
    //   ***
    //  *****
    // *******
    //*********
    public static void PyramidStarPattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n + i; j++){
                if (j < n - i - 1) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
    // Hollow Pyramid Star Pattern, Difficulty: Medium
    //   *
    //  * *
    // *   *
    //*******
    public static void HollowPyramidStarPattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n + i; j++){
                if (j < n - i - 1) System.out.print(" ");
                else if (i == 0 || i == n - 1) System.out.print("*");
                else if (j == n - i - 1 || j == n + i - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    // Inverted Pyramid Star Pattern, Difficulty: Medium
    //*********
    // *******
    //  *****
    //   ***
    //    *
    public static void InvertedPyramidStarPattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n + n - i - 1; j++){
                if (j < i) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
    // Inverted Hollow Pyramid Star Pattern, Difficulty: Medium
    //*********
    // *     *
    //  *   *
    //   * *
    //    *
    public static void InvertedHollowPyramidStarPattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n + n - i - 1; j++){
                if (j < i) System.out.print(" ");
                else if (i == 0 || i == n - 1) System.out.print("*");
                else if (j == i || j == n + n - i - 2) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    // Half Diamond Star Pattern, Difficulty: Medium
    //*
    //**
    //***
    //****
    //*****
    //****
    //***
    //**
    //*
    public static void HalfDiamondStarPattern(int n){
        for(int i = 0; i < n + n - 1; i++){
            for(int j = 0; j < n; j++){
                if (i < n && j <= i) System.out.print("*");
                else if(i >= n && j < n + n - i - 1) System.out.print("*");
            }
            System.out.println();
        }
    }
    // Diamond Star Pattern, Difficulty: Medium
    //    *
    //   ***
    //  *****
    // *******
    //*********
    // *******
    //  *****
    //   ***
    //    *
    public static void DiamondStarPattern(int n){
        for(int i = 0; i < n + n - 1; i++){
            for(int j = 0; j < n + n - 1; j++){
                if (i < n){
                    if(j < n - 1 - i || j >= n + i) System.out.print(" ");
                    else System.out.print("*");
                }
                else{
                    if(j < i - n + 1 || j > n + n - i + 2) System.out.print(" ");
                    else System.out.print("*");
                }
            }
            System.out.println();
        }
    }


}
