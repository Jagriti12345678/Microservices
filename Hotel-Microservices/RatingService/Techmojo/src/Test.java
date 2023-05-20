import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args){
        ArrayList<Integer> p1=new ArrayList<>();
        ArrayList<Integer> p2=new ArrayList<>();

        p1.add(9);
        p1.add(9);
        //p1.add(4);
        p2.add(1);
        //p2.add(2);
        //p2.add(3);

        Test test=new Test();
        ArrayList<Integer> res=test.sum(p1, p2);
        System.out.println(res);

    }
    public ArrayList<Integer> sum(ArrayList<Integer> p1, ArrayList<Integer> p2){
        int m=p1.size();
        int n=p2.size();
        int x=0;

        ArrayList<Integer> res=new ArrayList<>();
        if(m>n){
            x=m-n;
        }else{
            x=n-m;
        }
        res.add((p1.get(m-1)+p2.get(n-1))%10);

        int i=m-2;
        int j=n-2;

        while(i>=0 || j>=0){
            int y=p1.get(i) + p2.get(j);
            int digit=y%10;
            int carry=y/10;
            res.add(digit + carry);
            i--;
            j--;
        }
        if(m>n){
            while(x>0){
                res.add(p1.get(x-1));
                x--;
            }
        }else{
            while(x>0){
                res.add(p2.get(x-1));
                x--;
            }
        }
        Collections.reverse(res);
        return res;



    }

}
