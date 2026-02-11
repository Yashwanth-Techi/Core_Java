//
//public class Day1 {
//	public static void main(String[]args) {
//		
////		for(int i=0;i<=5;i++) {
////			for(int j=0;j<=5;j++) {
////				System.out.print("*");
////			}
////			System.out.println();
////		}
//		
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=3;j++) {
//				System.out.print("1");
//			}
//			System.out.println();
//		}
//	}
//}

//Triangle Star Pattern
//Right Triangle Star Pattern

//public class Day1{
//	public static void main(String[] args) {
//		for(int i=0;i<=5;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//	}
//}

//Inverted Right Triangle

// class InvertedTriangle {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Number Triangle 

// class NumberTriangle {
//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// Same Number Triangle

// class SameNumberTriangle {
//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }

// Floyd’s Triangle


// class FloydTriangle {
//     public static void main(String[] args) {
//         int n = 4, num = 1;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(num++ + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// Hollow Square

// class HollowSquare {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if (i == 1 || i == n || j == 1 || j == n)
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }


// Pyramid Pattern

// class Pyramid {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int s = 1; s <= n - i; s++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= 2 * i - 1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Right Aligned Star Triangle

// class RightAlignedTriangle {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int s = 1; s <= n - i; s++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// class HollowSquare {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if (i == 1 || i == n || j == 1 || j == n)
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }

                                                                                              //palindron pattern 

// class PalindromePyramid {
//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = 1; i <= n; i++) {
//             for (int s = 1; s <= n - i; s++)
//                 System.out.print(" ");

//             for (int j = 1; j <= i; j++)
//                 System.out.print(j);

//             for (int j = i - 1; j >= 1; j--)
//                 System.out.print(j);

//             System.out.println();
//         }
//     }
// }









