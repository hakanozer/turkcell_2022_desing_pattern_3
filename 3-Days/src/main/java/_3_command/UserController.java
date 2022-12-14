package _3_command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserController {

    private List<ICommand> list = new ArrayList<>();

    public void action( ICommand... iCommands ) {
        list.addAll(Arrays.asList(iCommands));
    }

    public void report() {
        for( ICommand command : list ) {
            if ( command instanceof AddUser ) {
                System.out.println("AddUser Type");
            }
            if ( command instanceof RemoveUser ) {
                System.out.println("RemoveUser Type");
            }
            command.execute();
        }
        list.clear();
    }


}
