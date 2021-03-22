
package print.res;
import java.util.ArrayList;
import java.util.Collections;

public class UniqueRandomNumber {

        private int next=-1;
        ArrayList<Integer> list = new ArrayList<Integer>();        
        public UniqueRandomNumber(int x){           
        for (int i=0; i<x; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        }
        
        public int Value(){
            next++;
            return list.get(next);
        }
        
        public void ZeroNext(){
            Collections.shuffle(list);
            next=0;
        }
}
