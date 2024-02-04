class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        Human human = new Human(health,bandage);
        int time = attacks[attacks.length-1][0];
        int counter = 0;
        for(int i =1; i<=time;i++){
            if(attacks[counter][0] == i){
                human.hit(attacks[counter][1]);
                counter++;
                continue;
            }
            human.useSkill();
        }
        if(human.alive == false) return -1;
        else return human.nowHealth;
        //T초동안 붕대를 감으면서 1초마다x만큼의 체력을 회복함
        //t초 연속으로 붕대를 감는데 성공하면 y만큼의 체력을 추가로 회복함
        //기술을 쓰는 도중 몬스터에게 공격을 당하면 기술이 취소되고 공격을 당하는 순간에는 체력을 회복할 수 없음
        //기술이 취소당하거나 기술이 끝나면 그 즉시 붕대감기를 다시 사용하며 연속 성공 시간이 0으로 초기화됨
        //몬스터의 공격을 받으면 정해진 피해량만큼 현재 체력이 줄어듬
        //현재 체력이 0 이하가 되면 캐릭터가 죽으며 더 이상 체력을 회복할 수 없음
        //붕대감기 기술의 정보, 캐릭터가 가진 최대 체력과 몬스터의 공격 패턴이 주어질 때 캐릭터가 끝까지 생존할 수 있는지가 궁금
        //bandage -> 시전시간, 초당 회복량, 추가 회복량
        //health -> 체력
        //attacks -> 공격시간과 피해량을 가진 2인정수배열
        //남은 체력 리턴 or  죽으면 -1 리턴
    }
}

class Human{
    public int maxHealth;
    public int nowHealth;
    public int stack;
    public int[] skill;
    public boolean alive;
    
    public Human(int health, int[] skill){
        this.maxHealth = health;
        this.nowHealth = health;
        this.stack = 0;
        this.skill = skill;
        this.alive = true;
    }
    public void useSkill(){
        this.stack++;
        if(this.nowHealth < this.maxHealth) {
            this.nowHealth += this.skill[1];
            if(this.stack == this.skill[0]) {
                this.nowHealth += this.skill[2];
                this.stack = 0;
            }
        }
        if(this.nowHealth > this.maxHealth) this.nowHealth = this.maxHealth;
    }
    public void hit(int damage){
        this.stack = 0;
        this.nowHealth -= damage;
        if(this.nowHealth <=0) this.alive = false;
    }
    
}
