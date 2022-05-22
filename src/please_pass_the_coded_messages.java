import java.util.*;

public class please_pass_the_coded_messages {

    public static int solution(int[] l) {
        int sum = 0;

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        Queue<Integer> q3 = new LinkedList<>();

        Arrays.sort(l);
        for (int i = 0; i < l.length; i++) {
            sum = sum + l[i];
            if (l[i] % 3 == 0) {
                q1.add(l[i]);
            } else if (l[i] % 3 == 1) {
                q2.add(l[i]);
            } else {
                q3.add(l[i]);
            }
        }

        if (sum == 0) {
            return 0;
        }
        List<Integer> result = new ArrayList<>();
        if (sum % 3 == 0) {
            result = makeNum(q1, q2, q3);
        } else if (sum % 3 == 1) {
            if (!q2.isEmpty()) {
                q2.remove();
            } else {
                if (!q3.isEmpty()) {
                    q3.remove();
                } else {
                    return 0;
                }
            }
            result = makeNum(q1, q2, q3);
        } else if (sum % 3 == 2) {
            if (!q3.isEmpty()) {
                q3.remove();
            } else {
                if (!q2.isEmpty()) {
                    q2.remove();
                } else {
                    return 0;
                }
            }
            result = makeNum(q1, q2, q3);
        }

        int num = 0;
        for (Integer i : result) {
            num = (num * 10) + i;
        }

        return num;
    }

    public static List<Integer> makeNum(Queue<Integer> q1, Queue<Integer> q2, Queue<Integer> q3) {
        ArrayList<Integer> res = new ArrayList<>();
        while (!q1.isEmpty()) {
            res.add(q1.poll());
        }
        while (!q2.isEmpty()) {
            res.add(q2.poll());
        }
        while (!q3.isEmpty()) {
            res.add(q3.poll());
        }

        Collections.sort(res, Collections.reverseOrder());
        return res;
    }

//    public static int solution2(int[] l) {
//        int sum = 0;
//        StringBuilder res = new StringBuilder();
//        Arrays.sort(l);
//        for (int x : l) {
//            sum += x;
//        }
//        boolean flag = false;
//        if (sum % 3 == 1) {
//            for (int i = 0; i < l.length; i++) {
//                if (l[i] % 3 == 1) {
//                    l[i] = -1;
//                    flag = true;
//                    break;
//                }
//            }
//            if (!flag) {
//                int count = 0;
//                for (int i = 0; i < l.length; i++) {
//                    if (l[i] % 3 == 2) {
//                        count++;
//                        l[i] = -1;
//                    }
//                    if (count == 2) {
//                        break;
//                    }
//                }
//                if (count < 2) {
//                    return 0;
//                }
//            }
//        } else if (sum % 3 == 2) {
//            for (int i = 0; i < l.length; i++) {
//                if (l[i] % 3 == 2) {
//                    l[i] = -1;
//                    flag = true;
//                    break;
//                }
//            }
//            if (!flag) {
//                int count = 0;
//                for (int i = 0; i < l.length; i++) {
//                    if (l[i] % 3 == 1) {
//                        count++;
//                        l[i] = -1;
//                    }
//                    if (count == 2) {
//                        break;
//                    }
//                }
//                if (count < 2) {
//                    return 0;
//                }
//            }
//        }
//        for (int i = l.length - 1; i >= 0; i--) {
//            if (l[i] != -1) {
//                res.append(l[i]);
//            }
//        }
//        if (res.length() == 0) {
//            return 0;
//        } else if (res.charAt(0) == '0') {
//            return 0;
//        } else {
//            return Integer.parseInt(res.toString());
//        }
//    }


    public static void main(String[] args) {
        please_pass_the_coded_messages obj = new please_pass_the_coded_messages();

       int res = obj.solution(new int[]{3, 1, 4, 1});
//       int res = obj.solution2(new int[]{3, 1, 4, 1, 5, 9});
//        int res = obj.solution2(new int[]{8, 6, 7, 1, 0});
//        int res = obj.solution(new int[]{});
        System.out.print(res);
    }


}
