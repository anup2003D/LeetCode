class Solution {
    public int maxProduct(int n) {
        int largest=-1;
        int secondLargest=-1;
        while(n>0){
            int num=n%10;
            if(num>=largest){
                secondLargest=largest;
                largest = num;            
            }
            else if(num<largest && num>secondLargest){
                secondLargest=num;
            }
            n/=10;
        }
        System.out.print(largest +" "+ secondLargest);
        return secondLargest*largest;
    }
}