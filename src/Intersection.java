import java.util.ArrayList;
import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {

        int nums1[]={4,9,5};
int nums2[]={9,4,9,8,4};

        HashSet<Integer> set1=new HashSet<Integer>();
        HashSet<Integer> set2=new HashSet<Integer>();
        ArrayList<Integer> al=new ArrayList<Integer>();

        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }

        for(Integer i: set1){
            if(set2.add(i) == false){
                //arr[count]=i;
                //count++;
                al.add(i);
            }
        }

        int arr[]=new int[al.size()];
        int count=0;
        for(Integer i: al){
            arr[count]=i;
        }


        //return arr;
    }
}
