package graphs.time_needed_to_inform_all_employees;

// Given:
//      - A company has n employees with unique IDs from 0 to n-1.
//      - The head of the company has the ID headID.
//      - You will receive a managers array where managers[i] is the ID of the manager for employee i.
//      - Each Employee has one direct manager. The company head has no manager (managers[headID] = -1).
//      - It's guaranteed the subordination relationships will have a tree structure.
//      - The head of the company want to inform akk employees of news. He will inform his direct subordinates
//        and so on until everyone knows the news.
//      - We will receive an informTime array where informTime[i] is the time it takes for employee i
//        to inform all their direct subordinates.
// TODO - Required:
//      Return the total number of minutes it takes to inform all employees of the news.
//      Ex:
//          8 employees: 0,1,2,3,4,5,6,7        headID=4
//          managers[2,2,4,6,-1,4,4,5]
// Constrains:
//      - 1 <= n
//      - 0 <= headID < n
//      - 0 <= informTime[i] (informTime[i] == 0 if employee i has no subordinates)
public interface InfoBroadcastTimerCalculator {
    int numOfMinutes(int n, int headID, int[] managers, int[] informTime);
}
