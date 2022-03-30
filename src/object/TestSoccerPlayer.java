package object;

public class TestSoccerPlayer {
    public static void main(String[] args){
        SoccerPlayer s1 = new SoccerPlayer("NgKhanh", 81, 811, 42);
        System.out.println("Name of SoccerPlayer is: "+ s1.getName());
        System.out.println("Number of SoccerPlayer is: "+ s1.getNumber());
        System.out.println("xLocation of SoccerPlayer is: "+ s1.getxLocation());
        System.out.println("yLocation of SoccerPlayer is: "+ s1.getyLocation());

        SoccerPlayer s2 = new SoccerPlayer("NgKhanh", 81, 811);
        System.out.println("Name of SoccerPlayer is: "+ s2.getName());
        System.out.println("Number of SoccerPlayer is: "+ s2.getNumber());
        System.out.println("xLocation of SoccerPlayer is: "+ s2.getxLocation());
        System.out.println("yLocation of SoccerPlayer is: "+ s2.getyLocation());

        SoccerPlayer s3 = new SoccerPlayer("NgKhanh", 81);
        System.out.println("Name of SoccerPlayer is: "+ s3.getName());
        System.out.println("Number of SoccerPlayer is: "+ s3.getNumber());
        System.out.println("xLocation of SoccerPlayer is: "+ s3.getxLocation());
        System.out.println("yLocation of SoccerPlayer is: "+ s3.getyLocation());

        SoccerPlayer s4 = new SoccerPlayer("NgKhanh");
        System.out.println("Name of SoccerPlayer is: "+ s4.getName());
        System.out.println("Number of SoccerPlayer is: "+ s4.getNumber());
        System.out.println("xLocation of SoccerPlayer is: "+ s4.getxLocation());
        System.out.println("yLocation of SoccerPlayer is: "+ s4.getyLocation());
        SoccerPlayer s5 = new SoccerPlayer();
        System.out.println("Name of SoccerPlayer is: "+ s5.getName());
        System.out.println("Number of SoccerPlayer is: "+ s5.getNumber());
        System.out.println("xLocation of SoccerPlayer is: "+ s5.getxLocation());
        System.out.println("yLocation of SoccerPlayer is: "+ s5.getyLocation());
    }
}
