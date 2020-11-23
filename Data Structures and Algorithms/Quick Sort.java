public class Main
{

  static void QuickSort (int arr[], int left, int right)
  {

    int i = left;
    int j = right;
    int mid = (left + right) / 2;
    int pivot = arr[mid];

    while (i <= j)
      {

	while (arr[i] < pivot)
	  {

	    i++;

	  }
	while (arr[j] > pivot)
	  {

	    j--;
	  }

	if (i <= j)
	  {

	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	    i++;
	    j--;
	  }
	if (left > j)
	  {

	    QuickSort (arr, left, j);


	  }

	if (right < i)
	  {

	    QuickSort (arr, i, right);
	  }

      }

  }

  static void printArray (int arr[])
  {

    for (int i = 0; i <= arr.length - 1; i++)
      {

	System.out.print (arr[i] + " ");

      }


  }

  public static void main (String args[])
  {


    int arr[] = { 22, 1, 0, 100 };
    QuickSort (arr, 0, arr.length - 1);

    Main ob = new Main ();
    ob.printArray (arr);

  }

}
