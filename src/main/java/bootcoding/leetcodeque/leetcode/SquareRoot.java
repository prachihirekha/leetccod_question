package bootcoding.leetcodeque.leetcode;

public class SquareRoot {
        public static int mySqrt(int x) {
            long s =1;
            long e =x;
            long ans=0;
            while(s<=e){
                long mid =s+(e-s)/2;
                if(mid*mid==x){
                    ans=(int)mid;
                    break;
                }else if(mid*mid<x){
                    s=mid+1;
                    ans =mid;
                }else{
                    e=mid-1;
                }
            }
            return (int)ans;
        }

    public static void main(String[] args) {
        int n=mySqrt(8);
        System.out.println(n);
    }
    }

