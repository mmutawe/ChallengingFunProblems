package graphs.time_needed_to_inform_all_employees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InfoBroadcastTimerCalculatorImpl implements InfoBroadcastTimerCalculator {

    private int maxBroadcastTime = 0;

    // Time: O(n), Space: O(n)
    @Override
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {

        Map<Integer, List<Integer>> managerMap = new HashMap<>();
        for (int i = 0; i < manager.length; i++) {
            if (!managerMap.containsKey(manager[i])) {
                ArrayList<Integer> value = new ArrayList<>();
                value.add(i);
                managerMap.put(manager[i], value);
            } else {
                managerMap.get(manager[i]).add(i);
            }
        }

        findMaxBroadcastTime(headID, managerMap, informTime, 0);
        return maxBroadcastTime;
    }

    private void findMaxBroadcastTime(int currNode, Map<Integer, List<Integer>> managerMap, int[] informTime, int currBroadcastTime) {
        if (informTime[currNode] == 0) {
            return;
        }

        currBroadcastTime += informTime[currNode];
        if (currBroadcastTime > maxBroadcastTime) {
            maxBroadcastTime = currBroadcastTime;
        }

        int finalCurrBroadcastTime = currBroadcastTime;
        for (int emp: managerMap.get(currNode)){
                findMaxBroadcastTime(emp, managerMap, informTime, finalCurrBroadcastTime);
        }
    }
}
