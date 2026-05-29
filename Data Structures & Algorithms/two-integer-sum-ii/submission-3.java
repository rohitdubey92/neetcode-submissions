class Solution {
    public int[] twoSum(int[] numbers, int target) {
   
   int start =0;
   int end = numbers.length-1;

   while(start<end){
        if(numbers[start]+numbers[end]==target){
            return new int []{++start, ++end};
        }
        if(numbers[start]+numbers[end]>target){
            end--;
            continue;
        }
        else{
            start++;
            continue;
        }
   
   }

   return new int []{};
    }
}
