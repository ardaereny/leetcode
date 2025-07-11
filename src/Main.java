//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import merge_sorted_array.Solution1;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Solution1 sınıfını test etmek için örnek veriler
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        
        System.out.println("Birleştirmeden önce nums1: " + Arrays.toString(nums1));
        System.out.println("nums2: " + Arrays.toString(nums2));
        
        // Solution1 sınıfının bir örneğini oluştur
        Solution1 solution = new Solution1();
        
        // merge metodunu çağır
        solution.merge(nums1, m, nums2, n);
        
        System.out.println("Birleştirmeden sonra nums1: " + Arrays.toString(nums1));
    }
}