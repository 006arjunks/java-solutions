class Candy {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] left = new int[n];
        int[] right = new int[n];
        for(int i=1; i<n; i++){
            if(ratings[i]>ratings[i-1]) left[i] = left[i-1]+1;
            if(ratings[n-i]<ratings[n-i-1]) right[n-i-1] = right[n-i]+1;
        }
        int res = 0;
        for(int i =0; i<n; i++) res+=Math.max(left[i], right[i]);
        return res+n;
    }
  public void main(String[] args) {
    int[] ratings =  new int[] {1,2,2};
    System.out.println(candy(ratings));
  }
}
