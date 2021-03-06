import java.util.Arrays;
public class Merge{
public static void mergesort(int[]data){
  mergesort(data,Arrays.copyOf(data,data.length),0, data.length-1);

  //mergesort(data,0, data.length-1);
}
private static void insertionSort(int [] data, int start, int end){
    for(int i =start+1;i<=end;i++){
      if(data[i]<data[i-1]){
        int from = i-1;
	while(from>=start && data[from]>data[i]) from--;
	insert(data,from+1,i);
      }
    }
  }
  private static void insert(int [] data, int from, int to){
    int temp = data[from];
    data[from] = data[to];
    for(int j=from+1;j<=to;j++){
      int LocTemp = data[j];
      data[j]=temp;
      temp = LocTemp;

    }
  }
private static void mergesort(int[]data,int lo,int hi){
  if (hi-lo<40) {
    insertionSort(data,lo,hi);
  }
  else{
    int avr = (lo+hi)/2;
    mergesort(data,lo,avr);
    mergesort(data,avr+1,hi);
    int [] merger = new int[hi-lo+1];
    int left =lo;
    int right =avr+1;
    while(left<=avr || right<=hi){
      //Just in case one gets used up
      if (left>avr){
        merger[left+right-lo-avr-1]=data[right];
        right++;
      }
      else if (right>hi){
        merger[left+right-lo-avr-1]=data[left];
        left++;
      }
      else if (data[left] <= data[right]) {
        merger[left+right-lo-avr-1]=data[left];
        left++;
      }
      else if (data[right] < data[left]) {
        merger[left+right-lo-avr-1]=data[right];
        right++;
      }
    }
    for(int i=lo;i<=hi;i++){
      data[i]=merger[i-lo];
    }
  }
  }
private static void mergesort(int[] data, int[] temp, int lo, int hi){
  if (hi-lo<55) {
    insertionSort(data,lo,hi);
  }
  else{
    int avr = (lo+hi)/2;
    mergesort(temp, data, lo, avr);
    mergesort(temp, data, avr+1, hi);
    int left = lo;
    int right = avr+1;
    int valLeft = temp[left];
    int valRight = temp[right];
    while(left<=avr || right<=hi){
      //Just in case one gets used up
      
      if (right>hi || left<=avr && valLeft <= valRight) {
        data[left+right-avr-1]=valLeft;
        left++;
	if(left<=avr) valLeft = temp[left];

      }
      else {
        data[left+right-avr-1]=valRight;
        right++;
	if(right<=hi) valRight = temp[right];
      }

    }
  }
  }
}
