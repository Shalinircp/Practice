package inter;

public class MergeArray {

    public static void main(String... args) {
        System.out.println("Merging two arrays");

        int[] arr1={4,5,6,8,9};
        int[] arr2={1,1,2,3,4};
        int n1=arr1.length;
        int n2=arr2.length;
        int[] arr3=new int[n1+n2];

        int i=0,j=0,k=0;
        while(i<n1 && j<n2) {
            if(arr1[i]<arr2[j])
                arr3[k++]=arr1[i++];
                else
                arr3[k++]=arr2[j++];
        }

        while(i<n1) {
            arr3[k++]=arr1[i++];
        }
        while(j<n2){
            arr3[k++]=arr2[j++];
        }

        for(int m:arr3){
            System.out.println(m);
        }
    }
}


