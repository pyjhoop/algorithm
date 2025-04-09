package org.algorithm.programers.level1;

public class 공원산책 {
    public static void main(String[] args) {
        String[] park = {"OSO","OOO","OXO","OOO"};
        String[] routes = {"E 2","S 3","W 1"};

        String[][] square = new String[park[0].length()][park.length];
        // 2차원 배열 세팅 및 S의 위치를 찾는다. 50*50 이므로 시간은 충분함.
        int startX = 0;
        int startY = 0;
        for(int i = 0; i < park.length; i++) {
            String[] strArr = park[i].split("");
            for(int j = 0; j < strArr.length; j++) {
                if(strArr[j].equals("S")){
                    startX = j;
                    startY = i;
                }
                square[j][i] = strArr[j];
            }
        }

        int xMax = park[0].length();
        int yMax = park.length;
        // routes 배열에서 반복문을 돌면서 진행 방향 및 칸수를 조회 후, 해당 방향에 장애물이 있는지 또는 범위를 벗어났는지 확인
        for(String str: routes){
            String[] strArr = str.split(" ");
            String direction = strArr[0];
            Integer step = Integer.parseInt(strArr[1]);

            // 조건문 x는 0이상 park.length 미만이어야 한다.
            // y는 0 이상, park[0].length 미만이어야 한다.
            if(direction.equals("E") || direction.equals("W")) {
                int final1 = 0;
                if(direction.equals("E")){
                    final1 =  startX + step;
                }else {
                    final1 = startX - step;
                }
                if(final1 >= xMax || final1 < 0) {
                    continue;
                }else {
                    // 탐색을 해야함. step 반복문 만큼 이동하면서 X가 있는지 찾아야함.
                    boolean flag = false;
                    for(int k = 1; k <= step; k++){
                        int p = direction.equals("E")? k: k*-1;
                        String street = square[startX + p][startY];
                        if(street.equals("X")){
                            flag = true;
                            break;
                        }
                    }
                    if(flag) continue;
                    startX = final1;
                };
            }else {
                int final1 = direction.equals("S")? startY + step : startY - step;
                if(final1 >= yMax || final1 < 0){
                    continue;
                }else {
                    boolean flag = false;
                    for(int k = 1; k <= step; k++){
                        int p = direction.equals("S")? k: k*-1;
                        String street = square[startX][startY + p];
                        if(street.equals("X")){
                            flag = true;
                            break;
                        }
                    }
                    if(flag) continue;
                    startY = final1;
                };
            }



        }
        int[] answer = {startX, startY};
        System.out.println(answer);
    }
}
