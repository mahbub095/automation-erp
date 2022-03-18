public class Break {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==5){
                //breaking the loop
                continue;
            }
            System.out.println(i);
        }
    }
}
