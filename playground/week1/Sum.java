package week1;

import java.util.concurrent.RecursiveAction;

class Sum {
    /**
     * FJ tasks are executed in a ForkJoinPool, which is a pool of Java threads.
     * This pool supports the invokeAll() method that combines both the fork and join operations by executing a set of
     * tasks in parallel, and waiting for their completion. For example, ForkJoinTask.invokeAll(left,right) implicitly
     * performs fork() operations on left and right, followed by join() operations on both objects.
     */
    static class ASum extends RecursiveAction {
        int[] array; // input array
        int lo, hi; // subrange
        int sum; // return value

        ASum(int[] array, int lo, int hi) {
            this.array = array;
            this.lo = lo;
            this.hi = hi;
        }

        @Override
        protected void compute() {
            sum = 0;
            for (int i = lo; i <= hi; i++)
                sum += array[i];
        } // compute()
    }




    public static void main(String[] args) {
//            Asum.re
        ASum.invokeAll();
        int[] array = new int[]{1, 2, 3, 4, 5};
    }
}
