package jp.ac.uryukyu.ie.e175770;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     *コンストラクタ
     * @param name:名前
     * @param maximumHP:最大HP
     * @param attack:攻撃力
     */

    public LivingThing(String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * 死んでいるか判断する
     * @return　trueなら死亡
     */
    public boolean isDead() {
        return dead;
    }

    /**
     * ゲッターメソッド
     * @return　名前
     */
    public String getName() {
        return name;
    }

    public void attack(LivingThing opponent) {
        if (dead == false) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        } else {
            int damage = 0;
        }
    }

    /**
     * hitpointのゲッター
     * @return　HP
     */
    public int getHitPoint() {
        return hitPoint;
    }

    /**
     *hitpointのセッター
     * @param hitPoint
     */
    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    /**
     * attackのゲッター
     * @return
     */
    public  int getAttack(){
        return attack;
    }

    public void setAttack(){
        this.attack = attack;
    }

    /**
     * deadのゲッター
     * @return
     */
    public boolean getDead(){
        return dead;
    }

    /**
     * deadのセッター
     * @param dead:生死状態
     */
    public void setDead(boolean dead){
        this.dead = dead;
    }

    /**
     * 自分へのダメージを計算するメソッド
     * @param damage:ダメージ
     */
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }
}

