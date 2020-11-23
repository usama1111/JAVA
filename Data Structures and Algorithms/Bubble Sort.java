public class Main
{

  public static void main (String args[])
  {

    int arr[] = { 2, 3, 1, 7, 0 };
    int n = arr.length - 1;

    for (int i = 0; i <= arr.length - 1; i++)
      {
	for (int j = i+1; j <= arr.length - 1; j++)
	  {

	    if (arr[i] > arr[j])
	      {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	      }


	  }



      }

  

System.out.println("Bubble Sorting");
for(int i = 0 ; i<= arr.length-1;i++){
    
    System.out.print(arr[i] + " ");
    



}}}
