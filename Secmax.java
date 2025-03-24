
public class Secmax {
    public static void main(String[] args){
        int[] arr={20,1,3,45,55,67};
        int max = Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                smax=max;
                max=arr[i];
            }
            if(arr[i]>smax && arr[i]!=max)
            {
                smax=arr[i];
            }
        }
        System.out.println(max+" "+smax);

    }
    
}
