public class ErrorMsg {

    private String msgs[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-Of-Bounds"
    };

    String getErrorMsg(int i) {
      if (i >=0 && i < msgs.length) return msgs[i];
      else return "Invalid Error Code";
    };
}

class ErrMgs{
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();

        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(10));
    }
}
