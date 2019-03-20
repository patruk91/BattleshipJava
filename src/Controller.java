import java.util.Map;
import java.util.TreeMap;

public class Controller {


    public void runner() {
        View view = new View();
        Reader reader = new Reader();
        ControllerHelper controllerHelper = new ControllerHelper();
        Player firstPlayer = new Player();
        Player secondPlayer = new Player();
        
        

        view.printMenu();
        view.printQuestion("Option");
        reader.getStringFromUser();




        for (Map.Entry<String, Integer> entry : controllerHelper.getShipNamesWithLength().entrySet()) {

        }

    }



    }
}
