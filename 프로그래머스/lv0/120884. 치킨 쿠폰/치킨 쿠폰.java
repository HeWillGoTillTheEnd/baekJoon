class Solution {
    public int solution(int chicken) {
        int serviceChicken = 0;
        int chickenCount = chicken;
        int cuponCount = 0;
        while( chickenCount != 0){
            chickenCount--;
            cuponCount++;
            if(cuponCount == 10) {
                chickenCount++;
                serviceChicken++;
                cuponCount = 0;
            }
        }
        return serviceChicken;
    }
}