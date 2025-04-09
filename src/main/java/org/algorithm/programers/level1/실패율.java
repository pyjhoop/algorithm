package org.algorithm.programers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 실패율 {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        double[] arr = new double[N];
        int[] answer = new int[N];
        int total = stages.length;

        Arrays.sort(stages);
        for(int i = 1; i <= N; i++){
            int head = 0;
            for(int j = 0; j < stages.length; j++){
                if(stages[j] == i){
                    head++;
                }
            }

            arr[i - 1] = (total == 0) ? 0 : head / (double) total;
            total -= head;
        }

        List<Stage> stageList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            stageList.add(new Stage(i + 1, arr[i]));
        }

        stageList.sort((a, b) -> {
            if (b.failureRate == a.failureRate) {
                return Integer.compare(a.stageNumber, b.stageNumber);
            } else {
                return Double.compare(b.failureRate, a.failureRate);
            }
        });

        for (int i = 0; i < N; i++) {
            answer[i] = stageList.get(i).stageNumber;
        }

        System.out.println(answer);

    }
    static class Stage {
        int stageNumber;
        double failureRate;

        Stage(int stageNumber, double failureRate) {
            this.stageNumber = stageNumber;
            this.failureRate = failureRate;
        }
    }

}
