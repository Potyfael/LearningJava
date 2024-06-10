
import java.time.Instant;
import java.util.Date;
import entities.*;


public class Main {

    public static void main(String[] args) {

        Date moment = Date.from(Instant.now());
        String title = "Traveling to new Zealand";
        String content = "Im going to visit this wonderful country!";
        int likes = 12;
        Post post1 = new Post(moment, title, content, likes);
        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow thats awesome!");
        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");
        System.out.println(post1);
        post1.addComment(c1);
        System.out.println(post1);
        post1.addComment(c2);







    }
}