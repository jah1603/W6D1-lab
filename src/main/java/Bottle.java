public class Bottle {
    private int volume;

    public Bottle(int volume) {

        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public int drink() {
        return volume -= 10;
    }

    public int empty() {
        return volume -= volume;
    }


    public int fill() {
        return volume += (100 - volume);
    }
}
