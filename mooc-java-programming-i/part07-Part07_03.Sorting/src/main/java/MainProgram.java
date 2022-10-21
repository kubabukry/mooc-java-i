
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    public static int smallest(int[] array){
        int smallest=array[0];
        for(int i : array){
            if(smallest>i){
                smallest = i;
            }
        }
        return smallest;
    }
    public static int indexOfSmallest(int[] array){
        int index = 0;
        int smallestIndex=0;
        int smallest = array[0];
        for(int i : array){;
            if(smallest>i){
                smallest = i;
                smallestIndex=index;
            }
            index++;
        }
        return smallestIndex;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int smallest=startIndex;
        for(int i=startIndex; i<table.length; i++){
            if(table[smallest]>table[i]){
                smallest = i;
            }
        }
        return smallest;
    }
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public static void sort(int[] array){
        int n = array.length;
        int j=0;                            //n=5 j=0
        while (true){                       //true
            System.out.print("[");          //print [..]
            int i = 0;
            for(int el : array){
                System.out.print(el);
                i++;
                if(i<array.length){
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println("");         //print end

            int min_index;
            if(j<n) {                     //j<4
                min_index = indexOfSmallestFrom(array, j); //startindx=1 min_index=1
                swap(array, j, min_index);  //j=0 array[0]=2 array[1]=3
            }
            j++;
            if(j>=n){                       //j=1 n=5
                break;
            }
        }
    }


}
