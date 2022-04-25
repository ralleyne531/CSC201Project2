public class ProblemOne {
        public void my_quicksort ( int[] array){
            quicksort_helper(array,0, array.length-1);
        }
        private void quicksort_helper ( int[] array, int low, int high){
            if (low < high) {
                int piv = partition(array, low,high);
                quicksort_helper(array, low, piv - 1);
                quicksort_helper(array, piv + 1, high);
            }
        }
        private int partition ( int[] array, int low, int high){
            int pivot = array[low];
            int top = high + 1;
            int bottom = low - 1;
            while (bottom <= top) {
                if (array[bottom] < pivot){
                    bottom++;
                }
                if (array[top] > pivot) {
                    top--;
                }
                if(bottom < top) {
                    swap(array, bottom, top);
                }
            }
            return bottom;
        }
        private static void swap(int[] array, int low, int high){
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
        }
    }
    // The
