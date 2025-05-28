class MediaPlayer implements ActionController {

    @Override
    public void start() {
        System.out.println("Player started");
    }

    @Override
    public void pause() {
        System.out.println("player paused");
    }

    @Override
    public void stop() {
        System.out.println("player stopped");
    }
}
