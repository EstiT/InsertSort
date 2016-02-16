class insertsort{
	public static void main (String[] str){
		//Sample unsorted arrray:
		int unsorted[]={41,6,11,9,10,20,3};
		
		//Run from the 2nd element to the end of the array
		for (int i=1; i<unsorted.length;i++){
			int j=i;
			//if two adjacent elements are not in decreasing order
			while (j>0 && unsorted[j]>unsorted[j-1]){
				//then switch them
				int temp=unsorted[j-1];
				unsorted[j-1]=unsorted[j];
				unsorted[j]=temp;
				j--;
			}
		} 
		
		//display sorted array
		for (int i=0;i<unsorted.length;i++){
			System.out.print(unsorted[i]+ " ");
		
		}
		System.out.println();


	}
	
}