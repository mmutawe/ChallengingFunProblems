package graphs.time_needed_to_inform_all_employees;

public class Test {
    public static void main(String[] args) {
        InfoBroadcastTimerCalculator timerCalculator = new InfoBroadcastTimerCalculatorImpl();

        int ans =0;
        ans = timerCalculator.numOfMinutes(6,2, new int[]{2,2,-1,2,2,2}, new int[]{0,0,1,0,0,0});
        System.out.println(ans);
        System.out.println();

        ans = timerCalculator.numOfMinutes(7,6, new int[]{1,2,3,4,5,6,-1}, new int[]{0,6,5,4,3,2,1});
        System.out.println(ans);
        System.out.println();

    }
}
