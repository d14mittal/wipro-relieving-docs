
public class Library {

    int input1 [] = {34,67,8,98,34,2,34,65,76,-1};
        int input2 [] = {8,25,34,98,-1};
        ArrayList <Integer>  arr = new ArrayList <Integer> ();
        for(int i=0;i<input1.length;i++)
        {
            arr.add(input1[i]);
        }
        int ans[] = new int[input2.length-1];
        for(int j=0;j<input2.length-1;j++)
        {
            ans[j]= arr.indexOf(input2[j])==-1? -1:arr.indexOf(input2[j])+1;
            arr.remove(new Integer(input2[j]));
            return ans;
        
    }
    
}
