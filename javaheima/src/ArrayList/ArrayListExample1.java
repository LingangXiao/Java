package ArrayList;

import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {
        //某个班级考试成绩为：98， 77， 66， 89， 79， 50， 100
        //需要把低于80分的分数删除掉
        ArrayList<Integer> score = new ArrayList<>();
        score.add(98);
        score.add(77);
        score.add(66);
        score.add(89);
        score.add(79);
        score.add(50);
        score.add(100);
        System.out.println(score);

        for (int i = 0; i < score.size(); i++) {
            int scores = score.get(i);
            if (scores <= 80) {
                score.remove(i);
                i = i - 1; //arraylist删除完元素后，后面的元素会向前移动一位，所以需要i-1，保证遍历了每一个元素
            }
        }
        System.out.println(score);

        //或者倒着删除
        for (int j = score.size() - 1; j >= 0; j--) {
            int scores1 = score.get(j);
            if (scores1 <= 80) {
                score.remove(j);
            }
        }

        System.out.println(score);

    }
}
