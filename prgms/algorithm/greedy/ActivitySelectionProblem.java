package algorithms.greedy;

import java.util.ArrayList;
import java.util.Collections;

public class ActivitySelectionProblem {

    static class Activity {
        int start = 0;
        int end = 0;

        public Activity(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString(){
            return this.start + " - " + this.end;
        }
    }

    public static void maxActivities(ArrayList<Activity> activities){

        System.out.println("Given Activities -> " + activities);
        Collections.sort(activities, (o1, o2) -> o1.end - o2.end);

        ArrayList<Activity> selectedActivities = new ArrayList<>();
        int currentEnd = -1;
        for (int i = 0; i <activities.size() ; i++) {
            Activity currentActivity = activities.get(i);
            if(currentActivity.start >currentEnd){
                selectedActivities.add(currentActivity);
                currentEnd = currentActivity.end;
            }
        }
        
        System.out.println("Selected Activities -> " + selectedActivities);
    }

    public static void main(String[] args) {
        ArrayList<Activity> activities = new ArrayList<>();
        activities.add(new Activity(1, 3));
        activities.add(new Activity(2, 5));
        activities.add(new Activity(0, 7));
        activities.add(new Activity(6, 8));
        activities.add(new Activity(9, 11));
        activities.add(new Activity(10, 12));
        maxActivities(activities);
    }
}