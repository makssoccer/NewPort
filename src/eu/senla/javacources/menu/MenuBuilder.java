package eu.senla.javacources.menu;

import eu.senla.javacources.menu.actions.*;

public class MenuBuilder {

    public Menu mainMenu;
    public Menu creatShips;
    public Menu printWaitingShips;

    private static MenuBuilder instance;

    private MenuBuilder() {
        buildMenu();
    }

    public static MenuBuilder getInstance() {
        if (instance == null) {
            instance = new MenuBuilder();
        }
        return instance;
    }

/*
     1. Посмотреть сколько воды в порту
     2. Посмотреть список кораблей в порту
     3. Удалить корабль из порта (вода остаётся в порту)
     4. Создать корабль
        -> наполнить корабль контейнерами с водой
     5. Посмотреть список кораблей, ожидающих прибытия в порт
        -> посмотреть инормацию по конкретному кораблю
     6. Загрузить корабль в порт
     7. Выйти из программы
 */
    public void buildMenu() {
        mainMenu = new Menu("Main");
        creatShips = new Menu("Создать корабль");
        printWaitingShips = new Menu("Посмотреть список кораблей, ожидающих прибытия в порт");
        mainMenuInit();
        createShipsInit();
        printWaitingShipsInit();

        Navigator.getInstance().setCurrentMenu(mainMenu);
    }

    public void mainMenuInit() {
        mainMenu.getMenuItems().add(new MenuItem("1. Посмотреть сколько воды в порту", new DisplayPortInfoAction()));
        mainMenu.getMenuItems().add(new MenuItem("2. Посмотреть список кораблей в порту", new DisplayShipsInPortAction()));
        mainMenu.getMenuItems().add(new MenuItem("3. Удалить корабль из порта", new DeleteShipToPortAction()));
        mainMenu.getMenuItems().add(new MenuItem("4. Создать корабль", new InitCreateShipContextAction(), creatShips));
        mainMenu.getMenuItems().add(new MenuItem("5. Посмотреть список кораблей, ожидающих прибытия в порт", null, printWaitingShips));
        mainMenu.getMenuItems().add(new MenuItem("6. Загрузить корабль в порт", new AddShipToPortAction()));
        mainMenu.getMenuItems().add(new MenuItem("7. Выйти из программы", new ExitAction()));

    }
    public void createShipsInit() {
        creatShips.getMenuItems().add(new MenuItem("1. Завершить создание корабля", new FinishCreateShipAction(), mainMenu));
        creatShips.getMenuItems().add(new MenuItem("2. Добавить маленький контейнер", new AddSmallContainerToShipAction()));
        creatShips.getMenuItems().add(new MenuItem("3. Добавить большой контейнер", new AddBigContainerToShipAction()));
    }
    public void printWaitingShipsInit() {
        printWaitingShips.getMenuItems().add(new MenuItem("1. Вернутся в главное меню", new FinishCreateShipAction(), mainMenu));
        printWaitingShips.getMenuItems().add(new MenuItem("2. Показать список ожидающих кораблей", new PrintWaitingShipsIdAction()));
        printWaitingShips.getMenuItems().add(new MenuItem("3. Показать информацию о ожидающем корабле", new PrintWaitingShipInfoAction()));
    }

}
