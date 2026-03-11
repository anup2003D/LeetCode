class Solution {
    public int[] reverse(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++; e--;
        }
        return arr;
    }
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int x=n;
        int count=0;

        while(x>0){
            x=x/2;
            count++;
        }
        int[] arr=new int[count];
        for(int i=0; i<count; i++){
            arr[i]=n%2;
            n/=2;
        }
        reverse(arr);
        // System.out.println(x+" "+n);
        for(int i=0; i<count; i++){
            //System.out.println(arr[i]);
            arr[i]=Math.abs(arr[i]-1);
            //System.out.println(arr[i]);
        }
        for(int i=count-1; i>=0; i--){
            n+=arr[i]*Math.pow(2,x++);
        }
        return n;
    }
}