package org.algorithm.programers.level1;


public class 동영상_재생기 {
    public static void main(String[] args) {
        String video_len = "10:55";
        String pos = "00:05";
        String op_start = "00:15";
        String op_end = "06:55";
        String [] commands = {"prev", "next", "next"};

        // 전부 초로 만들어서 하면 됨.
        int videoLen = Integer.parseInt(video_len.split(":")[0])*60 + Integer.parseInt(video_len.split(":")[1]);
        int posLen = Integer.parseInt(pos.split(":")[0])*60 + Integer.parseInt(pos.split(":")[1]);
        int opStart = Integer.parseInt(op_start.split(":")[0])*60 + Integer.parseInt(op_start.split(":")[1]);
        int opEnd = Integer.parseInt(op_end.split(":")[0])*60 + Integer.parseInt(op_end.split(":")[1]);

        for(String str: commands) {
            if(posLen >= opStart && posLen <= opEnd) {
                posLen = opEnd;
            }

            if(str.equals("next")){
                posLen += 10;
                if(posLen > videoLen) posLen = videoLen;
            }else {
                posLen -= 10;
                if(posLen < 0) posLen = 0;
            }
            if(posLen >= opStart && posLen <= opEnd) {
                posLen = opEnd;
            }
        }
        String min = (posLen / 60) < 10? "0"+(posLen/60): (posLen/60)+"";
        String sec = (posLen % 60) < 10? "0"+(posLen%60): (posLen%60)+"";

        System.out.println(min+":"+sec);

    }
}
