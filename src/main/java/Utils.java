import org.apache.log4j.Logger;

public class Utils {

    //visszaadja a legnagyobb elem indexét
    //üres tömb vagy null esetén -1
    private static final Logger logger = Logger.getLogger(Utils.class);

    public static int maxker(int[] array){
        int idx = -1;
        int max = Integer.MIN_VALUE;
        logger.info("Search is starting...");
        for(int i=0; i<array.length; i++){
            if (array[i] > max){
                idx = i;
                max = array[i];
            }
        }
        return idx;
    }

    public static void main(String[] args){

        maxker( new int[] {1,2,3});
    }

}


