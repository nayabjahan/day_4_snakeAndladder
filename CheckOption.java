public class CheckOption {
    //constant variables
    public static final int noplay= 0;
    public static final int ladder = 1;
    public static final int snake = 2;

    public static void main(String[] args){
        System.out.println("welcome to snake and ladder game");
        int position = 0;
        System.out.println("player position:"+position);
//generating random number from 1 to 6
        int roll_die = (int)(Math.floor(Math.random() * 10) % 6 ) + 1;
        int check_option=(int)(Math.floor(Math.random() * 10) % 3);
        //check for options like noplay,ladder,snake
        switch (check_option) {
            case noplay:
                position = 0;
                System.out.println("its a noplay! stays here in the same place");
                break;
            case ladder:
                position += roll_die;
                System.out.println("its a ladder! player moves ahead by" + roll_die);
                break;
            case snake:
                position -= roll_die;
                System.out.println("ita a snake! player moves behind by" + roll_die);
                break;
            default:
                break;
        }
        }


}
