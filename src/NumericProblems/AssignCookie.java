package NumericProblems;
/*
Assume you are an awesome parent and want to give your children some cookies.
But, you should give each child at most one cookie.
Each child i has a greed factor gi, which is the minimum size of a cookie that the child will be content with;
and each cookie j has a size sj. If sj >= gi, we can assign the cookie j to the child i, and the child i will be content.
Your goal is to maximize the number of your content children and output the maximum number.

Note:
You may assume the greed factor is always positive.
You cannot assign more than one cookie to one child.
 */

import java.util.Arrays;

public class AssignCookie {
    public int findContentChildren(int [] g, int [] s){
        Arrays.sort(g);
        Arrays.sort(s);
        int gg=0, ss=0;
        while(gg<g.length && ss<s.length){
            if(g[gg]<=s[ss]){
                gg++;
                ss++;
            }else{
                ss++;
            }
        }
        return gg;

    }
    public static void main(String [] args){
        AssignCookie obj = new AssignCookie();
        int [] child ={1,2};
        int [] size ={1,2,3};
        System.out.println(obj.findContentChildren(child, size));
    }
}
