import events.commands;
import events.embeds;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class main {

    public static void main(String args[]) throws Exception {

        JDA jda = new JDABuilder("NzIxNDUzMzE2NjIxNTk4ODIw.XuUvzA.eViyxHepntuS1Rkq3H159tziRCo").build();

        jda.addEventListener(new commands());
        jda.addEventListener(new embeds()
        );

    }
}
