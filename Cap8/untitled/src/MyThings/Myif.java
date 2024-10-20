package MyThings;

public interface Myif {

    int getUserID();

    default int getAdminID(){
        return 1;
    }


}
