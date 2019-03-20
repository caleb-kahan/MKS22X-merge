public class Merge{
public static void mergesort(int[]data){
  mergesort(data,0,data.length-1);
}
public static void mergesort(int[]data,int lo,int hi){
  if (lo >= hi) return;
  int avr = (lo+hi)/2;
  mergesort(data,lo,avr);
  mergesort(data,avr+1,hi);
  int [] merger = new int[hi-lo+1];
  int left =lo;
  int right =avr+1;
  int leftLimit = avr;
  int rightLimit =hi;
  while(left<=leftLimit || right<=rightLimit){
    //Just in case one gets used up
    if (left>leftLimit){
      merger[left+right-lo-avr-1]=data[right];
      right++;
    }
    else if (right>rightLimit){
      merger[left+right-lo-avr-1]=data[left];
      left++;
    }
    else if (data[right] < data[left]) {
      merger[left+right-lo-avr-1]=data[right];
      right++;
    }
    else if (data[left] <= data[right]) {
      merger[left+right-lo-avr-1]=data[left];
      left++;
    }
  }
  data=merger;
  }
}
