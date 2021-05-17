package skills;

import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
// referencias
//https://www.youtube.com/watch?v=5rHIHUjuNRk
public class SimpleAlexaSkillStreamHandler extends SkillStreamHandler {

    public SimpleAlexaSkillStreamHandler() {
        super(Skills.standard()
                .addRequestHandler(new WelcomeRequestHandler())
                .addRequestHandler(new CustomLaunchRequestHandler())
                .build());
    }
}
