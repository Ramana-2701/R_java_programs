package New;

public class loop {

    public static void main(String[] args) {

        int j;

        for(j=1;j<=10 ;j++){
           if(j%2!=0){
               continue;
           }
            System.out.println(j);
        }
    }
}
