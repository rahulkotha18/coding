public class MergeSort{  
	void merge(int arr[], int start, int mid, int end){  
  
		int l = mid - start + 1;  
		int r = end - mid;  
		int LeftArray[] = new int [l];  
		int RightArray[] = new int [r];   
		for (int i=0; i<l; i++)  
			LeftArray[i] = arr[start + i];  
  
		for (int i=0; i<r; i++)  
			RightArray[i] = arr[mid + 1 + i];  
  
		int i = 0, j = 0;  
		int k = start;  
		while (i<l && j<r){  
			if (LeftArray[i] <= RightArray[j]){  
   				arr[k] = LeftArray[i];  
	   			i++;
   			}else{  
   				arr[k] = RightArray[j];  
	   			j++;  
   			}
   			k++;  
  		}

		while (i<l){  
			arr[k] = LeftArray[i];  
			i++;  
				k++;  
		}  
  
		while (j<r){  
			arr[k] = RightArray[j];  
			j++;  
			k++;  
		}	 
	}  
  
	void mergesort(int arr[], int start, int end){
		if (start<end){  
			int mid = (start+end)/2;  
			mergesort(arr, start, mid);  
			mergesort(arr , mid+1, end);  
			merge(arr, start, mid, end);  
		}		  
	}

	public static void main(String args[]){

		int arr[] = {10,4,6,3,2,1,9,5}; 
		MergeSort test = new MyMergeSort();  
		test.mergesort(arr, 0, arr.length-1);  
		System.out.println("\nSorted array"); 
		for(int i=0; i<arr.length;i++){  
			System.out.println(arr[i] + " ");  
    		}	
	}
}