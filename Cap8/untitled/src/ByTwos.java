public class ByTwos implements Series {

    int start;
    int val;
    int prev;

    public ByTwos() {
        this.start = 0;
        this.val = 0;
        prev = -2;
    }

    @Override
    public int getNext() {
        prev = val;
        val += 2;
        return val;
    }

    @Override
    public void reset() {
        val = start;
        prev = start = -2;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
        prev = x - 2;
    }

    int getPreious() {
        return prev;
    }
}
