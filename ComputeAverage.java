public class ComputeAvergae {
public static void main(String[] args) {
 
int[] myArray = new int[]{1,-2,4,-4,9,-6,16,-8,25,-10 };
 
double res = computeAverage(myArray);
 
System.out.println("Mean : " + res);
 
}
public static double computeAverage(int[] arr) {
double sum = 0; 
 
for (int i: arr) {
 
sum = sum + i;
 
} 
 return sum / arr.length;
 
}
 
