public class ByThree implements Series {

    int start;
    int val;

    ByThree() {
        start = 0;
        val = 0;
    }

    @Override
    public int getNext() {
        val += 3;
        return val;
    }

    @Override
    public void reset() {
        val = start;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
    }
}
