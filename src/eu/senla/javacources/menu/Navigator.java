package eu.senla.javacources.menu;


public class Navigator {


    private Menu currentMenu;// текущее меню

    private static Navigator instance;

    private Navigator() {
    }

    public static Navigator getInstance() {
        if (instance == null) {
            instance = new Navigator();
        }
        return instance;
    }

    public void printMenu() {
        for (MenuItem menuItem : currentMenu.getMenuItems()) {
            System.out.println(menuItem.getTitle());
        }
    }

    public void navigate(int index) {
        --index;

        int itemsCounter = currentMenu.getMenuItems().size();
        if (itemsCounter >= index && index < 0) {// условие  коректно
            System.out.println("we have a problem Huston");
            return;
        }

        MenuItem menuChoice = currentMenu.getMenuItems().get(index);

        if (menuChoice.getAction() != null) {
            menuChoice.executeAction();
        }
        if(menuChoice.getNextMenu() != null){
            this.setCurrentMenu(menuChoice.getNextMenu());
        }

    }

    public Menu getCurrentMenu() {
        return currentMenu;
    }

    public void setCurrentMenu(Menu currentMenu) {
        this.currentMenu = currentMenu;
    }
}
