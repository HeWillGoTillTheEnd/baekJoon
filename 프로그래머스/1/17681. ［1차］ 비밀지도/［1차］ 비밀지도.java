import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        //이진수로 변경부터 해야함
        String[] bin1 = new String[n];
        String[] bin2 = new String[n];

        for(int i =0; i<n;i++){
            String bina1 = changeBinary(arr1[i],n);
            String bina2 = changeBinary(arr2[i],n);
            bin1[i] = bina1;
            bin2[i] = bina2;
        }
        String[] map = new String[n];
        for(int i =0; i<n;i++){
            map[i] = "";
        }
        //이진수 변경
        for(int i = 0; i<n; i++){
            for(int j =0; j<n; j++){
                if(bin1[i].charAt(j) == '1' || bin2[i].charAt(j) == '1'){
                    map[i] += "#";
                } else map[i] += " ";
            }
        }
        
        return map;
    }
    public String changeBinary(int num, int n){
        Stack<Integer> st = new Stack<Integer>();
        while(num != 0) {
			st.push(num % 2);
			num /= 2;
            
		}
        while(st.size() != n){
            st.push(num);
        }
        String binaryNum = "";
        while(!st.isEmpty()) {
			binaryNum += st.pop();
		}
        
        return binaryNum;
    }
}