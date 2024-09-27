package September.twentysixth;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;

public class VideoPlayer {
    public static void main(String[] args) {

        String video_len="34:33";
        LocalTime video_lon1 = LocalTime.parse(video_len);
        String pos="13:00";
        LocalTime pos1 = LocalTime.parse(pos);


        System.out.println(pos1);
        String op_start="00:55";
        LocalTime op_start2 = LocalTime.parse(op_start);
        String op_end="02:55";
        String[] commands = {"next", "prev"};
       // "13:00"
        if (pos1.isAfter(LocalTime.parse(op_start)) && pos1.isBefore(LocalTime.parse(op_end))) {
            pos1 = LocalTime.parse(op_end);
        }
        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("next")) {
                if(op_start2.isBefore( pos1.plusMinutes(10))&&LocalTime.parse(op_end).isAfter(pos1.plusMinutes(10))) {
                    pos1 = LocalTime.parse(op_end);
                } else if (LocalTime.parse(video_len).isBefore( pos1.plusMinutes(10))) {
                    pos1 = LocalTime.parse(video_len);
                } else {
                    pos1=pos1.plusMinutes(10);
                }
            } else if (commands[i].equals("prev")) {
                if(op_start2.isBefore( pos1.minusMinutes(10))&&LocalTime.parse(op_end).isAfter(pos1.minusMinutes(10))) {
                    pos1 = LocalTime.parse(op_end);
                }
                if (LocalTime.parse("00:00").isAfter(pos1.minusMinutes(10))) {
                    pos1 = LocalTime.parse(video_len);
                } else {
                    pos1=pos1.minusMinutes(10);
                }
            }
        }
    }
}
