import java.util.*;

class Solution {
    static final Integer INF = Integer.MAX_VALUE;
        boolean[] visited;
        int[] costs;
        int[] path;
     private int findMinNode(int[] costs, boolean[] visited) {
        int minCost = INF;
        int minNode = -1;

        for (int i = 1; i < costs.length; i++) {
            if (!visited[i] && costs[i] < minCost) {
                minCost = costs[i];
                minNode = i;
            }
        }

        return minNode;
    }

    public int solution(int N, int[][] road, int K) {
        int answer = 0;

        
   
        visited = new boolean[N+1];
        costs = new int[N+1];
        path = new int[N+1];

        Arrays.fill(costs, INF);

        int startNode = 1;
        costs[startNode] = 0;

        for (int i = 1; i < N ; i++) {
            int minNode = findMinNode(costs, visited);
            visited[minNode] = true;

            for (int[] edge : road) {
                int from;
                int to;
                int cost;
                from = 0;
                to = 0;
                cost = 0;

                if (minNode == edge[0]) {
                    from = edge[0];
                    to = edge[1];
                    cost = edge[2];
                } else if (minNode == edge[1]) {
                    from = edge[1];
                    to = edge[0];
                    cost = edge[2];
                }

                if (!visited[to] && from == minNode && costs[from] + cost < costs[to]) {
                    costs[to] = costs[from] + cost;
                    path[to] = from;
                }
            }
        }
        
    
       for (int i = 1; i < costs.length; i++) {
            if(costs[i]<=K)
                answer++;
        }

        return answer;
    }
}