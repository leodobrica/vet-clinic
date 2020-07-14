package serenitylabs.tutorials.vetclinic.playingball.model;

import static serenitylabs.tutorials.vetclinic.playingball.model.Game.*;

public class Child {
    public void goPlay(Game game) {
        PlaySport player = new PlaySport();
        player.play(game);
//        if (game == Football) {
//            player.play(game);
//        } else if (game == Tennis) {
//            new PlayTennis().play();
//        } else if (game == Cricket) {
//            new PlayCricket().play(game);
//        } else if (game == Handball) {
//            new PlayHandball().play(game);
//        } else if (game == Hockey) {
//            new PlayHockey().play(game);
//        }
    }
}
