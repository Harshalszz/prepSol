package ProblemsDay_344;

public class TrafficSignalColor {
//https://leetcode.com/problems/traffic-signal-color/?envType=problem-list-v2&envId=string

    public String trafficSignal(int timer) {

        if(timer == 0){
            return "Green";
        }else if(timer == 30){
            return "Orange";
        }else if(timer >30 && timer <= 90){
            return "Red";
        }else{
            return "Invalid";
        }

    }
    public static void main(String[] args) {

    }
}
