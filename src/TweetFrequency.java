import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class TweetFrequency {

    HashMap<String, TreeSet<Integer>> hm;
    public TweetFrequency() {
        hm=new HashMap<>();
    }

    public void recordTweet(String tweetName, int time) {
        if(!hm.containsKey(tweetName)){
            hm.put(tweetName, new TreeSet<Integer>());
        }
        hm.get(tweetName).add(time);
    }

    public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {
        int delta=0;
        if(freq.equals("minute")){
            delta=60;
        }
        else if(freq.equals("hour")){
            delta=3600;
        }
        else if(freq.equals("day")){
            delta=86400;
        }
        List<Integer> res=new ArrayList<Integer>();
        if(hm.containsKey(tweetName)){
            TreeSet ts=hm.get(tweetName);
            for(int i=startTime;i<=endTime;i=i+delta){
                res.add(ts.subSet(i,Math.min(i+delta,endTime+1)).size());
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TweetFrequency obj=new TweetFrequency();
        obj.recordTweet("tweet3",0);
        obj.recordTweet("tweet1",10);
        obj.recordTweet("tweet2",10);
        obj.recordTweet("tweet3",20);
        obj.recordTweet("tweet3",60);
        obj.recordTweet("tweet2",210);
        obj.recordTweet("tweet3",40);

        List<Integer> res=new ArrayList<Integer>();
        //res=obj.getTweetCountsPerFrequency("hour","tweet3",0,10);
        //res=obj.getTweetCountsPerFrequency("day","tweet3",0,60);
        //res=obj.getTweetCountsPerFrequency("minutes","tweet2",0,120);
        res=obj.getTweetCountsPerFrequency("hour","tweet3",0,210);

        System.out.println(res);
    }
}
