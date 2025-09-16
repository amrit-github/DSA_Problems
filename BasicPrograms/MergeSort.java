public record MergeSort() {
    public static void main(String[] args) {

        int[] arr = {12,31,35,8,32,17};

        mergeSort(arr, 0, arr.length-1);
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
        System.out.println();

    }

    static void mergeSort(int[] arr, int start, int end){

        if(start < end){

            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);

        }
    }

    static void merge(int[] arr, int start, int mid, int end){
        int i = start, j = mid+1;
        int[] temp = new int[end-start+1];

        int idx = 0;
        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){
                temp[idx] = arr[i];
                i++;
                idx++;
            }else{
                temp[idx] = arr[j];
                j++;
                idx++;
            }
        }
        while(i <= mid){
            temp[idx] = arr[i];
            i++;
            idx++;
        }
        while(j <= end){
            temp[idx] = arr[j];
            j++;
            idx++;
        }
        for(int k = 0, l=start; k < temp.length; k++,l++){
            arr[l] = temp[k];
        }
    }
}