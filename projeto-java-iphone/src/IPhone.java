public class IPhone implements MusicPlayer, Phone, InternetBrowser {
    @Override
    public void play() {
        System.out.println("Playing music");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music");
    }

    @Override
    public void selectSong(String song) {
        System.out.println("Selecting song: " + song);
    }

    @Override
    public void call(String number) {
        System.out.println("Calling number: " + number);
    }

    @Override
    public void answer() {
        System.out.println("Answering call");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Starting voicemail");
    }

    @Override
    public void displayPage(String url) {
        System.out.println("Displaying page: " + url);
    }

    @Override
    public void addNewTab(String url) {
        System.out.println("Adding new tab with page: " + url);
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page");
    }
}