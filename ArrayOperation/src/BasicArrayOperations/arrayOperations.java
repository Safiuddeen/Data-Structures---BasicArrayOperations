package BasicArrayOperations;

import java.util.Arrays;

public class arrayOperations {
	
	// Method to insert an element at a specified position in an array
    public static int[] insert(int[] arr, int element, int index) {
        if (index < 0 || index > arr.length) {
            System.out.println("Invalid index");
            return arr;
        }
        
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[j++];
            }
        }
        
        return newArr;
    }

    // Method to delete an element at a specified position in an array
    public static int[] delete1(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index");
            return arr;
        }
        
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            newArr[j++] = arr[i];
        }
        
        return newArr;
    }
    
 // Method to delete an element at a specified position in an array
    public static int[] delete(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index");
            return arr;
        }
        
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            newArr[j++] = arr[i];
        }
        
        return newArr;
    }

    // Method to search for an element in an array
    public static int search(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    // Method to display the elements of an array
    public static void display(int[] arr) {
        System.out.println("Array elements: " + Arrays.toString(arr));
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {20, 30, 40, 50, 60};
        
        System.out.println("Initial array:");
        display(arr);

        // Inserting element 25 at index 2
        arr = insert(arr, 35, 2);
        System.out.println("After inserting 35 at index 2:");
        display(arr);

        // Deleting element at index 4
        arr = delete1(arr, 4);
        System.out.println("After deleting element at index 4:");
        display(arr);
       

        // Searching for element 30
        int index = search(arr, 40);
        if (index != -1) {
            System.out.println("Element 40 found at index: " + index);
        } else {
            System.out.println("Element 40 not found in the array");
        }
    }
}
