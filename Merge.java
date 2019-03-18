public static void mergesort(int[]data){
  mergesort(data,0,data.length-1);
}
public static void mergesort(data,lo,hi):
  if (lo >= hi) return;
  mergesort(data,lo,hi/2);
  mergesort(data,hi/2+1,hi);
  int [] merger = new int[hi-low+1];
  int left =0;
  int right =0;
  int leftLimit = hi/2-lo + 1;
  int rightLimit =hi-hi/2;
  while(left>)
