import java.util.*;

public class Main{
    //상하좌우 탐색
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    
    static boolean[][] visited;
    static int[][] A;
    static int[][] dist;
    static int N, M;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        
        A = new int[N][M];
        visited = new boolean[N][M];
        dist = new int[N][M];
        
        for(int i = 0; i<N; i++){
            String nums = sc.next(); //한줄 전체를 string으로 받아서 분리,int로 변환해서 넣기
            String[] parts = nums.split("");
            for(int j = 0; j<M; j++){
                A[i][j] = Integer.parseInt(parts[j]);
            }
        }
        BFS(0,0);
        System.out.println(dist[N-1][M-1]);
    }
    private static void BFS(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;
        dist[x][y] = 1; // 시작점의 거리 초기화
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int curX = current[0];
            int curY = current[1];

            // 상하좌우 탐색
            for (int i = 0; i < 4; i++) {
                int nextX = curX + dx[i];
                int nextY = curY + dy[i];

                // 범위를 벗어나거나 이미 방문했거나 벽(0)인 경우 건너뜀
                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M || visited[nextX][nextY] || A[nextX][nextY] == 0) {
                    continue;
                }

                // 다음 지점 큐에 추가
                queue.offer(new int[]{nextX, nextY});
                visited[nextX][nextY] = true;
                dist[nextX][nextY] = dist[curX][curY] + 1; // 거리 갱신
            }
        }
    }
    
}