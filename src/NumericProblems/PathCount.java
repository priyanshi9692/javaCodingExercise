package NumericProblems;

public class PathCount {
    public int pathCount(int m, int n){
        if(m==0 || n==0){
            return 0;
        }

        int count=countPath(0,0,m,n);
        return count;
    }
    public int countPath(int i, int j, int m, int n){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i<m-1 && j<n-1){
            return countPath(i+1,j,m,n)+countPath(i,j+1, m,n);
        }
        if(i<m-1){
           return countPath(i+1,j,m,n);
        }
        if(j<n-1){
           return countPath(i,j+1, m,n);
        }
        return 0;
    }
    public static void main(String [] args){
        PathCount obj=new PathCount();
        System.out.println(obj.pathCount(6,4));
    }
}
