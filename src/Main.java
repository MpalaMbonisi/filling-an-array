public class Main {
    public static void main(String[] args) {
        // declare an array
        int[] array=new int[10];

        // insert values to the array 
        for (int i=0; i< array.length;i++){
            array[i] = array.length - 1 - i;
        }
        
        // display the array using foreach 
        for (int z: array) {
            System.out.println(z);
        }
    }
}