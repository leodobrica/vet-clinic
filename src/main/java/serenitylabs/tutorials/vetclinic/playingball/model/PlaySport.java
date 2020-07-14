package serenitylabs.tutorials.vetclinic.playingball.model;

public class PlaySport implements Player{
    private Game game;

    @Override
    public void play(Game game) {

        this.game = game;
    }
}
