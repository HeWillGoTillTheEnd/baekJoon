class Solution {
    public String solution(String bin1, String bin2) {
        long sum = Long.valueOf(bin1) +Long.valueOf(bin2);
        String sumStr = String.valueOf(sum);
        int num = 1;
        while(num <= sumStr.length()){
            if(sumStr.charAt(sumStr.length()-num) == '2') 
                sum = sum - (2 * pow(num)) + (pow(num+1));
            else if(sumStr.charAt(sumStr.length()-num) == '3')
                sum = sum - (2 * pow(num)) + (pow(num+1));
            sumStr = String.valueOf(sum);
            num++;
        }
        String answer = String.valueOf(sum);
        return answer;
    }
    long pow(int i){
        long result = 1L;
        for(int j = 1;j<i;j++){
            result *= 10L;
        }
        return result;
    }
}