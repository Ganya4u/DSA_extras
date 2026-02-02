
public class Selection {


    public static  void selectionsort (int [] arr){

        for(int i=0 ; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};

        int n = arr.length;

        for(int i =0 ; i < n-1; i++){
            int smallest=i;

            for(int j=i+1 ; j<n ; j++ ){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }

            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }

        selectionsort(arr);


    }
}
