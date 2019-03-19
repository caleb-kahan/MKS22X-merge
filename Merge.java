public class Merge{
public static void mergesort(int[]data){
  mergesort(data,0,data.length-1);
}
public static void mergesort(int[]data,int lo,int hi){
  if (lo >= hi) return;
  mergesort(data,lo,hi/2);
  mergesort(data,hi/2+1,hi);
  int [] merger = new int[hi-lo+1];
  int left =lo;
  int right =(hi/2)+1;
  int leftLimit = hi/2;
  int rightLimit =hi;
  while(left<leftLimit || right<rightLimit){
    //Just in case one gets used up
    if (left>leftLimit || data[right] > data[left]) {
      merger[left+right-lo-hi/2-1]=data[right];
      right++;
    }
    if (right>rightLimit || data[left] >= data[right]) {
      merger[left+right-lo-hi/2-1]=data[left];
      left++;
    }
  }
  }
}
