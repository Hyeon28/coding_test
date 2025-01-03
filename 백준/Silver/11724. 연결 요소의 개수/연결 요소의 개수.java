import java.util.*;

public class Main {
    static List<List<Integer>> adjList;// 인접 리스트
    static boolean[] visited;//방문 리스트
    static int count;//연결 요소 개수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); //정점의 개수
        int M = sc.nextInt(); //간선의 개수
        
        count = 0;
        
        adjList = new ArrayList<>();
        visited = new boolean[N + 1]; 

        for (int i = 0; i <= N; i++ ) {
            adjList.add(new ArrayList<>()); //초기화
        }
        
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt(); 
            int v = sc.nextInt();
            adjList.get(u).add(v); // u -> v 추가
            adjList.get(v).add(u); // v -> u 추가 (무방향이므로 양쪽으로 추가)
        }
        
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) { // 아직 방문하지 않은 정점이라면
                dfs(i); // DFS 수행
                count++; // 연결 요소 개수 증가
            }
        }
        
        System.out.print(count);
    }
    public static void dfs(int node) {
        visited[node] = true; // 정점 방문 처리
           
        //현재 정점과 연결된 정점들 탐색
        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor);
                }    
            }
        }
}