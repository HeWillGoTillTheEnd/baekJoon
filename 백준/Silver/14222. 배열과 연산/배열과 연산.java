import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 효율적으로 받기 위한 BufferedReader 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 공백을 기준으로 문자열을 분리하기 위한 StringTokenizer 사용
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 첫 번째 줄에서 N(배열 크기)과 K(더할 수 있는 값)를 입력받음
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // N크기의 배열 생성
        int[] arr = new int[N];
        // 두 번째 줄의 입력을 받기 위한 새로운 StringTokenizer
        st = new StringTokenizer(br.readLine());
        // 배열에 입력값들을 저장
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // canMakeSequence 메서드의 결과에 따라 1 또는 0을 출력
        System.out.println(canMakeSequence(arr, N, K) ? 1 : 0);
    }

    private static boolean canMakeSequence(int[] arr, int N, int K) {
        // 1부터 N까지의 숫자가 사용되었는지 체크하기 위한 배열
        boolean[] used = new boolean[N + 1];
        // 입력 배열을 오름차순으로 정렬
        Arrays.sort(arr);

        // 배열의 각 원소에 대해 처리
        for(int i = 0; i < N; i++) {
            // 현재 숫자를 배치할 수 있는지 여부를 저장하는 변수
            boolean canPlace = false;

            // 1부터 N까지의 각 위치에 대해 시도
            for(int j = 1; j <= N; j++) {
                // 아직 사용되지 않은 위치라면
                if(!used[j]) {
                    // 현재 숫자를 저장
                    int num = arr[i];

                    // 현재 숫자에 K를 계속 더해가며 N보다 작거나 같을 때까지 시도
                    while(num <= N) {
                        // 만약 현재 숫자가 목표 숫자(j)와 같다면
                        if(num == j) {
                            canPlace = true;  // 배치 가능 표시
                            used[j] = true;   // 해당 위치 사용 표시
                            break;
                        }
                        num += K;  // K를 더함
                    }
                    // 배치에 성공했다면 다음 숫자로 넘어감
                    if(canPlace) break;
                }
            }

            // 현재 숫자를 어떤 위치에도 배치할 수 없다면 false 반환
            if(!canPlace) return false;
        }

        // 모든 숫자를 성공적으로 배치했다면 true 반환
        return true;
    }
}