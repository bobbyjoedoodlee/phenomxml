package events;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Objects;

public class embeds extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] messageSent = event.getMessage().getContentRaw().split(" ");
        String name = Objects.requireNonNull(event.getMember()).getUser().getName();
        Message okay = Objects.requireNonNull(event.getMessage());
        if (messageSent[0].equalsIgnoreCase("ezz")) {
            if (!event.getMember().getUser().isBot()) {
                event.getChannel().sendMessage("yore ez as fuck " + name).queue();
            }
        }
    }


}
