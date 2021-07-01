public class bruh {
    public static int[] cunLoser(int N, int L){
        int[] cunThoi = new int[N];
        int cunHoi = 0;
        for (int i = 1; i < 1000000; i++) {
            if (i < 10) {
                if (i / L != 1) {
                    cunThoi[cunHoi] = i;
                    //System.out.println(i);
                    cunHoi++;
                }
            } else if (i >= 10) {
                if (cunHoi < N) {
                    int cunUgly = i;
                    int cunUgly2 = 0;
                    boolean cunStinky = true;
                    while (cunUgly > 0) {
                        cunUgly2 = cunUgly % 10;
                        //System.out.println(cunUgly2);
                        if (cunUgly2 == L) {
                            cunStinky = false;
                        }
                        cunUgly = cunUgly / 10;
                    }
                    //System.out.println(cunStinky);
                    if (cunStinky == true) {
                        cunThoi[cunHoi] = i;
                        cunHoi++;
                    }
                }
            }
        }
        return cunThoi;
    }
    public static void main(String[] args) {
        //System.out.println("cun thoi nhu cuc cut");
        int[] cunSuperLoser = cunLoser(10, 1);
        for (int i = 0; i < cunLoser(10, 1).length; i++) {
            System.out.println("cun hoi: " + cunSuperLoser[i]);
        }
    }
}
