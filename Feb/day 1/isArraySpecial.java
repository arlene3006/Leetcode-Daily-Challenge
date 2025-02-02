class Solution {
    public boolean isArraySpecial(int[] a) {
        if(a.length==1) return true;
        for(int i=1;i<a.length;i++){
            if(a[i]%2!=0 && a[i-1]%2!=0 || a[i]%2==0 && a[i-1]%2==0){
                return false;
            }
        }
        return true;
    }
}
