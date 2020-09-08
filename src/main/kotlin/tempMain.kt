import stringmanipulation.groupAnagrams
import stringmanipulation.mostCommonWord
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.HashSet

fun main(){
    println("${groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))}")

    val para = "Bob hit a ball, the hit BALL flew far after it was hit."
    mostCommonWord(para, arrayOf("hit"))
}

/*
* Arrays.sort(logs, (s1, s2) -> {
            String[] split1 = s1.split(" ", 2);
            String[] split2 = s2.split(" ", 2);

            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));

            if(!isDigit1 && !isDigit2) {
                // both letter-logs.
                int comp = split1[1].compareTo(split2[1]);
                if (comp == 0) return split1[0].compareTo(split2[0]);
                else return comp;
            } else if (isDigit1 && isDigit2) {
                // both digit-logs. So keep them in original order
                return 0;
            } else if (isDigit1 && !isDigit2) {
                // first is digit, second is letter. bring letter to forward.
                return 1;
            } else {
                //first is letter, second is digit. keep them in this order.
                return -1;
            }
        });
        return logs;
* */